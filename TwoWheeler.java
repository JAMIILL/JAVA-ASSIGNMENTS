package Programs;

public class TwoWheeler {

		int noofwheels = 4;
		short noofmirrors = 2;
		long chassisnumber=123455767L;
		boolean ispunchered =false;
		String bikename= "KTM";
		double runningKM = 155.35;
		

		public static void main(String[] args) {
			TwoWheeler cal = new TwoWheeler();
			System.out.println("TWOWHEELER");
			System.out.println( "noofwheels " + cal.noofwheels);
			System.out.println("noofmirrors "+cal.noofmirrors);
	     	System.out.println("chassisnumber "+cal.chassisnumber);
			System.out.println("ispunchered "+cal.ispunchered);
		    System.out.println("bikename "+cal.bikename);
			System.out.println("runningKM "+cal.runningKM);
	}

}
