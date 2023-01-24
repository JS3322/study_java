package swing.ColumnDataSwap.src.com.js.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import swing.ColumnDataSwap.src.com.js.Input.TxtFileInput;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MyTransferHandler extends TransferHandler {

	 private JTable table;
	 private DefaultTableModel model;
	 private int rowIndex;
	 private int colIndex;

	@Override
	public int getSourceActions(JComponent c) {
	    return MOVE;
	}

	@Override
	protected Transferable createTransferable(JComponent source) {
TxtFileInput txtFileInput = new TxtFileInput();

		
		
		
		
	    table= (JTable)source;
	    model = (DefaultTableModel) table.getModel();
	    rowIndex = table.getSelectedRow();
	    colIndex = table.getSelectedColumn();


	    model.getValueAt(rowIndex, colIndex);

	    String value = (String)model.getValueAt(rowIndex, colIndex);
	    Transferable t = new StringSelection(value);
	    return t;
	}

	@Override
	protected void exportDone(JComponent source, Transferable data, int action) {

	    table= (JTable)source;
	    model = (DefaultTableModel) table.getModel();
	    rowIndex = table.getSelectedRow();
	    colIndex = table.getSelectedColumn();
	    
	    System.out.println("rowIndex = "+rowIndex);
	    System.out.println("colIndex = "+colIndex);
	    System.out.print("table >> ");
	   
	    System.out.println(table.getColumnName(colIndex));
	    System.out.println(table.getName());
	    System.out.println(table.getValueAt(rowIndex, colIndex));
	    System.out.println("exportDone");

	}

	@Override
	public boolean canImport(TransferSupport support) {
	    if (!support.isDataFlavorSupported(DataFlavor.stringFlavor)) {
	        return false;
	    }
	    return true;
	}

	@Override
	public boolean importData(TransferSupport support) {
	    System.out.println("importData");

	    table = (JTable) support.getComponent();
	    Object data= null;
	    int row = table.getSelectedRow();
	    int col = table.getSelectedColumn();


//	    System.out.println( "****this is drag ***"+ model.findColumn(table.getColumnName(colIndex)));
	    try {
	        data = (Object) support.getTransferable().getTransferData(DataFlavor.stringFlavor);
	    } catch (UnsupportedFlavorException e) {
	        System.out.println("unsupported Flavor Exception");
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("IO Exception");
	        e.printStackTrace();
	    }
	    int rowCount =table.getRowCount();
	    for(int i =0; i< rowCount;i++) {
	    	Object temp = table.getValueAt(i, colIndex);
		    model.setValueAt(table.getValueAt(i, col), i, colIndex);
		    model.setValueAt(temp, i, col);
	}

	    
	    model.fireTableStructureChanged();
	    return false;
	}
	}