package Programs;

public class VowelsRemove {

	public static void main(String[] args) {
		String s ="My name is jameel";
		char []c=s.toCharArray();
		int count = 0;
		for (int i =0;i<c.length;i++)
		{
			char ch =c[i];
			
			if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
			{
				if( (ch=='a'|| ch=='e' || ch =='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
				{
					count++;
					System.out.println(ch);
				}
			}
			
		}
	System.out.println(count);
	}

}
