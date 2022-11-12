package WEEK6;

public class Encap2 {

	public static void main(String[] args) {
		Encap1 call =new Encap1();
	
	System.out.println(call.get());
	System.out.println(call.get1());
	System.out.println(call.get2());
	call.set(30,20);
	System.out.println(call.get());
	System.out.println(call.get1());
	System.out.println(call.get2());

	}

}
