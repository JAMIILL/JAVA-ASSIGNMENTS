package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
//		// in array but we will get vertical order
//		int num1[] = {1,2,3};
//		
//		for (int i =num1.length-1;i>=0;i--)
//		{
//			System.out.println(num1[i]);
//		}
		

	//Normal we will get horizontal order (321)
		int num = 123;
		int rev = 0;
		
		while(num>0)
		{
			int n = num%10;  
			rev = (rev*10)+n;  
			num = num/10;      
		}
        System.out.println(rev);    
	}

}
