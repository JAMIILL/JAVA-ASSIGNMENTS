package Programs;

public class PrintOnlyNumbers {

	public static void main(String[] args) {
		
		String S ="lkjlkj lkjk Jameel  123";
		char c[] = S.toCharArray();
		String S1 = "";
		for(int i =0;i<c.length;i++)
		{
			char ch = c[i];
			if(ch>='0'&&ch<='9')
			{
				S1=S1+ch;
				
			}
			
			}
		System.out.println(S1);
	}

}
