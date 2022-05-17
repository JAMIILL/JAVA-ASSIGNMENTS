package ASSIGNMENTS;

public class armstrongnumber {

	public static void main(String[] args) {
			
			int a=153;
			int sum=0;
			int orginalNumber=a;                                                             //  15
			while(a>0) {                                                                    //   ___       1
				int rem=a%10;                                  //rem=3                     // 10[153    10/15
				sum=sum+(rem*rem*rem);                         //sum=0+27                 //     150       10
				a=a/10;                                        //a=15                    //       ___       5
				                                               //if(sum==orginalNumber) //        3
			}                                                  //if(27=15)
	if ( sum==orginalNumber) {                                 
		System.out.println("Armstrong number "+ sum );
	}
	else {
		System.out.println("NOT a armstrong num  "+ sum);
	}
		}

	}


