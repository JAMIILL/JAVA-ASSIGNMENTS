package Programs;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueNumbers {	
//		
//		Set<Integer> unique = new TreeSet<Integer>();
//		int [] num = {4,6,7,2,3,1,1,9,10,8,8,6};
//		//char nu[]= {'p','w','q'};
//		
//		
//		for(Integer i:num)
//		{
//			unique.add(i);
//		}
//			
//			
//		System.out.println(unique);
//	} 
		public static void main(String[] args)
		{
		    String str = "GeeksforGeeks";
		 
		    for (int i = 0; i < str.length(); i++)
		    {
		        int flag = 0;
		        for (int j = 0; j < str.length(); j++)
		        {
		            // checking if two characters are equal
		            if (str.charAt(i) == str.charAt(j) && i != j)
		            {
		                flag = 1;
		                break;
		            }
		        }
		        if (flag == 0)
		            System.out.print(str.charAt(i));
		    }
		}
		
}
