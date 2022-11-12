package WEEK6;

public class ConstructorOverloading {

	ConstructorOverloading()
	{
		System.out.println("Hi");
	}

	ConstructorOverloading(int a)
	{
		System.out.println("Hii" + a);
	}
	
	public static void main(String[] args) {	
		ConstructorOverloading call = new ConstructorOverloading();
		ConstructorOverloading call1 =  new ConstructorOverloading(15);
		
	}

}
