package WEEK6;

public class Superkeyword2 extends Superkeyword1 {

	  int a = 20;
	  Superkeyword2()
	  {
		  super();//for constructor
		  System.out.println("Child");}
	  void sample()
	  {
		  super.sample();//for parent methods 
		  
	  //System.out.println("super2" + a  );//basically java takes child class value if we want use "super" 
	  System.out.println("super2" + super.a  );
	  }
	 
		public static void main(String[] args) {
			
			Superkeyword2 call = new Superkeyword2();
			call.sample();
			

		}


}
