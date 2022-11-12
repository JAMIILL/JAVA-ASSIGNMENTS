package Programs;

public class palindrome {

	public static void main(String[] args) {
		String str="AMMA";
        String rev="";//Note; Dont give space(" ") 
        char array[] = str.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);//ref
			rev = rev+array[i];
			System.out.println(rev);//ref
		}
			if(rev.equals(str)) {
				System.out.println("Palindrome");
			}
			else
				System.out.println("Not");
	}

}
