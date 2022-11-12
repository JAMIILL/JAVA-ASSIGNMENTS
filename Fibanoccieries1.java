package Programs;

public class Fibanoccieries1 {

	public static void main(String[] args) {

		int range=8,first =0,second=1;
		
		for (int i = 1; i <=range; i++) {
		
        	int sum=first+second;//sum=0+1
                  first=second;//first=1
                  second=sum;//second=1 vice versa
	         System.out.println(sum);
		}
	}

	}

