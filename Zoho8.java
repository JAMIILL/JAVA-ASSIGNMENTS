
public class Zoho8 {

	public static int loo(int a,String s)
	{
		s = "yellow";
		a=a+2;
		return a;
	}
	public static void bar ()
	{
		int a =3;
		String s = "blue";
		a=loo(a,s);
		System.out.println("a="+a+"s="+s);
	}
	public static void main(String[] args) {
	bar();
	}

}//Ans a=5,s=blue 