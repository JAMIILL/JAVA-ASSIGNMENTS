package Week5;

import Week4.Static1;

public class This {



	static int a = 1;
	public static void details ()
	{
		System.out.println("Details");
		}
public  void Employee( int id ,String  name )
{
	this.Employee(id, name); 

}

public static void main(String[] args) {
	Static1 call = new Static1();
	System.out.println(a);
    details();
    call.Employee(12,"jam");
  
}
} 
