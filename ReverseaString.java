package Programs;

public class ReverseaString {

	public static void main(String[] args) {
		
		String s = "jameel";
		String a ="";
	
	
		char [] s1 = s.toCharArray();
		for (int i = s1.length-1;i>=0;i--)
		{
			a=a+s1[i];
		}
	System.out.println(a);
		
//		StringBuffer rev = new StringBuffer(s);
//		rev.reverse();
//		System.out.println(rev);
	
	
	
	
	}

}
