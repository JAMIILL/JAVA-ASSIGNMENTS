package Programs;

public class EvenSumof1to100 {

	public static void main(String[] args) {
	
  int num =100;
  int sum  = 0;
  for(int i=0;i<=100;i++)
  {
	  if (num%2==0)
	  {
		  sum=sum+i;
	  }
  }
  System.out.println(sum);
	}

}
