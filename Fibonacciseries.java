package ASSIGNMENTS;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);

			for(int i=0;i<=8;i++) {
			int sum= a+b;	//1
			a=b;           //1
	     	b=sum;//     1
	     	System.out.println(sum);
			}
	}
	

}
