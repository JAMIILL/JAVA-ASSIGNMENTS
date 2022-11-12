 package Week4;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Day2Set{

	public static void main(String[] args) {
		

		//Set<String> name=new TreeSet<String>();  // print in assci order
		Set<String> hash=new LinkedHashSet<String>();  // print an output based on giving input
		//Set<String> hash = new HashSet<String>();    // print in assci order but in random order & dont print the DUPLICATE numbers(used to remove the dublicate numbers)

 		hash.add("CTS");
		hash.add("Wipro");
		hash.add("HCL");
		
		System.out.println(hash);
		for (String string : hash) {
			System.out.println(string);
		}
		
		boolean remove =hash.remove(2);//WHY DO WE USE REMOVE HERE?
//here it takes index value because = except length & size every operations takes index values
 		System.out.println("remove" +remove); 

//
// 	for(int i=0 ;i<hash.size();i++)
//		{
// 		int Integer  = hash.get(i);
//			System.out.println("\n"+ Integer);
//		}
//	
 		int size = hash.size();//here it takes length
		System.out.println(size);

		boolean contains = hash.contains("CTS");
		System.out.println("contains" +contains);
		
		
	    boolean removeAll = hash.removeAll(hash);
	    System.out.println("Removeall" +hash);
	    
	    boolean empty = hash.isEmpty();
	    System.out.println(empty);
	} 
		
		
		

	}


