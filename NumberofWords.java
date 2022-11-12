package Programs;

public class NumberofWords {

	public static void main(String[] args) {
		String s = "My name is Jameel";
		String split[] = s.split(" ");
		System.out.println("Length is "+split.length);
		for (int i = 0; i < split.length; i++) {
			
			System.out.println(split[i]);
			
		}
		

	}

}
