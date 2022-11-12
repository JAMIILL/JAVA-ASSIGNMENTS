package Programs;

public class SmallCapNumSym {

	public static void main(String[] args) {
		String str = "Jameelmohamed455@gmail.com";
		char j[] = str.toCharArray();
		int    s=0,c=0,n=0,sy=0;
		
		String S="",C="",N="",SY="";
		
		for(int i=0;i<str.length();i++)
		{
			char a = j[i];
			if(Character.isLowerCase(a))
			{
				s++;
				S=S+a;
			}
			else if(Character.isUpperCase(a))  //Here we dont give if if if only else if
			{
				c++;
				C=C+a;
			}
			else if(Character.isDigit(a))
			{
				n++;
				N=N+a;
			}
			else
			{
				sy++;
				SY=SY+a;	
			}
		}
		
		System.out.println("Small"+" "+s+" "+S);
		System.out.println("Caps"+" "+c+" "+C);
		System.out.println("Num"+" "+n+" "+N);
		System.out.println("Symbol"+" "+sy+" "+SY);
	}

}
