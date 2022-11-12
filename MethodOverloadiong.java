package WEEK6;

public class MethodOverloadiong {

	public void sum(int a)
	{ 
		System.out.println(a);
	}
	 void sum(double a,String s)
	{
		System.out.println(a+s);
	
	}
	public static void main(String[] args) {
		
		MethodOverloadiong call = new MethodOverloadiong();
		call.sum(0);
		call.sum(12, "mohamed");
	}

}
