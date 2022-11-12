package Week5;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		
		String str = "babub";
		int length=str.length();
		System.out.println("length is "+length);
		char[] charArray = str.toCharArray();
		System.out.println("chararray" + charArray );//why it doenot print
//		for (char c : charArray) {
//			System.out.println(charArray[c]); //why we cant use foreach here
//		}
		for(int i=0;i<length-1;i++) { //here why i print upto 5 values even we give [i<len]then why we give [i<len-1]
		System.out.println(charArray[i]); 
		}
		Set<Character> val=new HashSet<Character>();
		val.add('b');
		val.add('a');
		val.add('b');
		val.add('u');
		val.add('b');
		System.out.println(val);
		String[] split=str.split("b");//why do we use split here
		System.out.println(split);//why it doesnt print
		System.out.println("length is " + split.length);
		
		
		for (int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
//		  for (String string : split) {  
//		    	 System.out.println(string);
//				
//			}
//		String remove =val.remove("b");
// 		System.out.println("remove" +remove); // why dont we use remove method,bcus there is no remove method in string,but in LIST. 
//		}
	   
	}	 
}
