package Programs;

public class PrimeNumber {

	
			public static void main(String[] args) {
				
				
				int a=5;
			    int b=0;
			for (int i = 1; i <=a; i++) {
				if(a%i==0){ 
			b++;
				
			}
			}
			if (b==2) {
				System.out.println(a + " " +"it is prime number"); //only 2 counts should be come.
			}
			else {
				System.out.println("it is not prime number");
			}
			}}


