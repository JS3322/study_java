package swing.ColumnDataSwap.src.com.js.Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class  TxtFileInput {
	
	
	public List<List> getText(){
	final File file = new File("/Users/js/Downloads/test.txt");
	List<List> order = new ArrayList<>();

	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	    String line;

	  
	    List<Double> a = new ArrayList<>();
	    List<Double> b = new ArrayList<>();
	    List<Double> c = new ArrayList<>();
	    List<Double> d = new ArrayList<>();
	    List<Double> e = new ArrayList<>();
	    List<Double> f = new ArrayList<>();
	   
	    order.add(a);
	    order.add(b);
	    order.add(c);
	    order.add(d);
	    order.add(e);
	    order.add(f);
	    

	    while ((line = br.readLine()) != null) {
	    	String array[] = line.split(" "); 

	    	a.add(Double.parseDouble(array[0]));
	    	b.add(Double.parseDouble(array[1]));
	    	c.add(Double.parseDouble(array[2]));
	    	d.add(Double.parseDouble(array[3]));
	    	e.add(Double.parseDouble(array[4]));
	      	f.add(Double.parseDouble(array[5]));
	    }
	   
//	    for (List i : order) {
//            System.out.print("["+i+"]"+"\n");
//        }
//        
//	    System.out.print("\n");
//
//	    Collections.swap(order, 1, 2);
//	 
//	    for (List i : order) {
//            System.out.print("["+i+"]"+"\n");
//        }  
	} 
	    catch (IOException e) {
	    e.printStackTrace();
	}

	
	
	return order;
}
	}
