package Week4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "AMAZON";
	    char[] charArray = word.toCharArray();
		Set<Character> num=new LinkedHashSet<Character>();
		System.out.println(charArray);
		int len = charArray.length;
		System.out.println(len);
//	    for (Character c : charArray) {
//	    	num.add(c);
	   for (int i = 0; i < charArray.length; i++) {
				num.add(charArray[i]);
	    	
		
  }
	    System.out.println(num);
	   
	}
	    }
