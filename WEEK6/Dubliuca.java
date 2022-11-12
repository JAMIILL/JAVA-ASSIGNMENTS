package WEEK6;

import java.util.Arrays;

public class Dubliuca {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		Arrays.sort(a);
		
//		for(int i = 0;i<=a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length-1;j++)
//			{
//				
//				if(a[i]==a[j])
//				{
//				System.out.println(a[i]);
//			}} 
//		}
		
		for(int i = 0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
