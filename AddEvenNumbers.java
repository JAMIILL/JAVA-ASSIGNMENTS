package Programs;

public class AddEvenNumbers {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5};
		
		int sum = 0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				sum = sum+num[i];
				System.out.println(sum);
			}
		
		}

	}

}
