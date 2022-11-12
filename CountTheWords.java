package Programs;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My name is jameel";
		String s[]=name.split(" ");
		int num =0;	
		for(int i=0;i<=s.length-1;i++)
		{
			num++;
			System.out.println(s[i]);
		}
      System.out.println(num);

	}

}
