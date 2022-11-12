package Programs;

public class Day2DublicateNumber {

	public static void main(String[] args) {
		int arr[] = {2,3,5,4,7,2,3,6,99,1};
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++) {//i=0(i.e i=2),j=i+1(i.e J=3)==>2==3 ,,,,vice versa
				if(arr[i]==arr[j])
				{
				
					System.out.println(arr[i]);
				}
			

			}}}}

