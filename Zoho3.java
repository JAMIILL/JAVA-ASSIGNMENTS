
public class Zoho3 {
public static void main(String[] args) {
	
	try {
		int a = -100;
		throw null;
		System.out.print(a); //Ans compilation error at line 8
	}catch(Exception obj)
	{
		System.out.println(obj.getMessage());
	}

}}
