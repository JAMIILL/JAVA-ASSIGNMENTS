package Programs;

public class Arrayevenodd {

	public static void main(String[] args) {
	int array[] = {1,2,3,4,5,6};
	System.out.println("ODD");
	for(int i =0;i<array.length;i++)
	{
		if (array[i]%2!=0)
		{
			System.out.println(array[i]);
		}
	}
	System.out.println("EVEN");
	for (int i = 0;i<array.length;i++)
		{
		if (array[i]%2==0)
		{
			System.out.println(array[i]);
		}}

	}}
