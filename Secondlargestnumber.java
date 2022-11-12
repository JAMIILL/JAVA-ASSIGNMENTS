package Week5;

import java.util.Arrays;

public class Secondlargestnumber {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,123,12,345,23423};
		Arrays.sort(num);
		for(int i =0;i<num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Second largest num" + num[num.length-2]);
	}

}
