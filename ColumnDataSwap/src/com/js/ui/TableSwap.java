package swing.ColumnDataSwap.src.com.js.ui;

import java.awt.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import swing.ColumnDataSwap.src.com.js.Input.TxtFileInput;
public class TableSwap extends JFrame {


	
	public TableSwap() {
	TxtFileInput txtFileInput=  new TxtFileInput();
//	ArrayList text =  (ArrayList) txtFileInput.getText();
	
	
	List<List> tableInput = txtFileInput.getText();
	System.out.println(tableInput.size());
	
	for(List i:tableInput ) {
		System.out.println(i);
	}

	
    setSize(500, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pan = new JPanel();
    pan.setLayout(new GridLayout(1, 1, 5, 5));

    Object[][] data = new Object[tableInput.size()][];
    String[] name = new String[] { "a", "b", "c" };
    

    
    
    DefaultTableModel model = new DefaultTableModel(data, name);
    JTable jt = new JTable(model);
    pan.add(jt);

    
    
    
    
    jt.setColumnSelectionAllowed(true);
    jt.setRowHeight(24);
    jt.setRowSelectionAllowed(false);
    jt.setFillsViewportHeight(true);
    jt.setDragEnabled(true);
    jt.setDropMode(DropMode.USE_SELECTION);
    jt.setTransferHandler(new MyTransferHandler());

    setContentPane(pan);
    setVisible(true);
}


}
