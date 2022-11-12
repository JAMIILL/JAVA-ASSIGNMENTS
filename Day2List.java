package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2List {

	public static void main(String[] args) {
		List<Integer> num =new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		//num.add(2, 9);// "METHOD OVERLOADING" JUST FOR REFERENCE
		
		System.out.println(num);
		
		int size = num.size();//here it takes length
		System.out.println(size);
		
		boolean contains = num.contains(1);
		System.out.println(contains);
	int remove =num.remove(1);//here it takes index value because = except length & size every operations takes index values
 		System.out.println(remove); 
		
	    boolean removeAll = num.removeAll(num);
	    System.out.println(num);
	    
	    boolean empty = num.isEmpty();
	    System.out.println(empty);
		
     	
		
		
		

	}

}
