package Programs;

public class MaximumNumber2 {

	public static void main(String[] args) {
      int num[] = new int[5];
		 num[0] = 100;
		 num[1] = 200;
		 num[2] = 300;
		 num[3] = 400;
		 
	int max =num[0];
	
	for(int i=0;i<num.length;i++)
	{
		 if(num[i]>max)   //if min  ===>  num[i]<min
		 {
			 max=num[i];
		 }
	}
	System.out.println(max);
			




	}

}
