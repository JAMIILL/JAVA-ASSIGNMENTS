package Programs;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		int a=153;
		int sum=0;
		int orginalNumber=a;                                                             //  15
		while(a>0) {                                                                    //   ___       1        1
			int rem=a%10;                                  //rem=3                     // 10[153    10/15    10/1
			sum=sum+(rem*rem*rem);                         //sum=0+27                 //     150       10
			a=a/10;                                        //a=15                    //       ___       
			                                               //if(sum==orginalNumber) //        3         5       1    
		}                                                  //if(27=15)
       if (sum == orginalNumber) {               
	System.out.println("Armstrong number "+ sum );
       }
       else
	{
	System.out.println("NOT a armstrong num  "+ sum);
}}}
	 
	

	


//int a=153;
//int sum=0;
                                                            
//while(a>0) {                                                   
//	int rem=a%10;                       0                                
//	sum=sum+(rem*rem*rem);                                         
//	a=a/10;                                                                 
//}
                                 
//System.out.println("Armstrong number "+ sum );
//}
