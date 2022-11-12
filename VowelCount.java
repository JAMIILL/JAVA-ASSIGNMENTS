package Programs;

public class VowelCount {

	public static void main(String[] args) {
		
		String s = "My name is jameel";
		char c[] = s.toCharArray();
		int count =0;
		for(int i = 0;i<c.length;i++)
		{
			if(c[i]=='a'|| c[i]=='e' )//|| ch =='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				count++;
			}
		}
     System.out.println(count);
	}

} 
