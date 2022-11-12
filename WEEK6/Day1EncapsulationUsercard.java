package WEEK6;

public class Day1EncapsulationUsercard {



		public static void main(String[] args) {
		Day1EncapulationPayment payment=new Day1EncapulationPayment();//Here we have to give the parent class name only bcus we derive the values from ther only.
	
		payment.getCreditCardNumber();//Here it is optional
		System.out.println(payment.getCreditCardNumber());
		payment.setCreditCardNumber("5555 65454 34624");
		System.out.println(payment.getCreditCardNumber());//why we cant use setcreditcardnumber here bcus we gave this keyword it takes value from the getcreditard.
	

	}

                               
}
