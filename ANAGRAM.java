package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ANAGRAM {

	public static void main(String[] args) {
	   String name1 = "Stops";
	   String name2 = "PotsS";
	   
	   //a)check the length of the strings;
	   int len1 = name1.length();	   
       int len2 = name2.length();
       System.out.println(len1);
       System.out.println(len2);
       
       //b)convert string into lowercase/uppercase;
      String lowercase = name1.toLowerCase();
      System.out.println("LOWER" +lowercase);
      String lowercase1 = name2.toLowerCase();
      System.out.println("LOWER2" +lowercase1); 
      
    
      
      //c)convert both strings into characters;
      if(len1==len2) {//first find whether the length is equal or not
     char[] charA = lowercase.toCharArray();
     char[] charA1 = lowercase1.toCharArray();
     System.out.println(lowercase);
     System.out.println(lowercase1);
     
     //d)sort both sorts;
     Arrays.sort(charA1);
     Arrays.sort(charA);
     System.out.println(charA);
     System.out.println(charA1);
     
     
     //e)check both the arrays has same value
     if(Arrays.equals(charA, charA1))    		 {
    	 System.out.println("ANAGRAM");
    		 }
     else
     {
    	 System.out.println("IT IS NOT AN ANAGRAM");
     }}
     
     else
     {
    	 System.out.println("IT IS NOT AN EQUAL LENGTH");
     }
     
//     //f)print the sort values using for loop
//      if(len1==len2) {
//    	  for(int i= 0;i< char Array.Length;i++)
//      }
//      
//      
	}

	}
