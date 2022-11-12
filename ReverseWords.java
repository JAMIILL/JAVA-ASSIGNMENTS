package Programs;

public class ReverseWords {

	public static void main(String[] args) {
		
		String S ="My Name Is Jameel";
		String S1 ="";
		String [] S2 = S.split(" ");
		for(String S3:S2)
		{
		String S4 = " ";
		for (int i = S3.length()-1; i>=0;i--) {
			char c =S3.charAt(i);
			S4 = S4+c;
		}
		S1 = S1+S4+" ";
		}
System.out.println(S1);
	}

}
