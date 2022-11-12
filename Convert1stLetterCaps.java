package Programs;

public class Convert1stLetterCaps {

	public static void main(String[] args) {
	String S = "my name is jameel";
	String S1 = "";
	String[] S3 = S.split(" ");
	//for(int i = 0;i<S.length()-1;i++) here we cant use bcus length is not going to be constant.
	for(String S4 : S3)
	{
		
		char ch =S4.charAt(0);//here 0 is index
	  //  System.out.println(ch);//ref = take 1st characters
		char a = Character.toUpperCase(ch);//then change the 1st chars into caps
		 
		String b = S4.substring(1);//here 1 is not index
//		 System.out.println(b);//print the letters except the 1st letters
		S1 =S1+a+b+" ";
	}
	System.out.println(S1);
	}

}
