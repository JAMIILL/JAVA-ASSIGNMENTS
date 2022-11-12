package Programs;

import org.testng.annotations.Test;

public class SumofDigits {
@Test
	public static void main(String[] args) {
		int a=123;
		int sum=0;//123/10
		
		while(a>0) {
		int rem=a%10;
		sum =sum+rem;
		a=a/10;
		}
		
		System.out.println(sum);
		
	}

}
//int a=123;
//int sum=0;//123/10
//int original =a;
//while(a>0) {
//int rem=a%10;
//sum =sum+rem;
//a=a/10;
//}
//if(sum==original )
//{
//System.out.println(sum);
//}
//else {
//	System.out.println("no");
//}

