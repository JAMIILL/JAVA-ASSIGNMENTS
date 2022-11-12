package Week4;

public class Day3OverrideClass2 extends Day3OverrideClass1 {
	
	public void JAMEEL()  // extends an another class == shows green triangle in side
	{
		System.out.println("JAMEEL");
	}
	public void JAM()
	{
		System.out.println("JAM");
	}

	public static void main(String[] args) {
		Day3OverrideClass2 call = new Day3OverrideClass2();
		call.JAMEEL();
		call.MOHAMAED();
		call.JAM();

	} 

}
