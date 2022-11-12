
public class dUBLICATE {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,4};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)//next loop j = i+1(++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
		
		}

	

}
