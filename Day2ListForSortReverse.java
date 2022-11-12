package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day2ListForSortReverse {

	public static void main(String[] args) {
	List<String> day =new ArrayList<String>();
		
		day.add("mon");
		day.add("tue");
		day.add("wed");
		

		System.out.println(day);
		
		for (String string : day) {      //used for line order
			System.out.println(string);
		}
		
			

			Collections.sort(day);    // used for sort ascending orders
			System.out.println("sort"+day);
			
			Collections.reverse(day);  // used for reverse order
			System.out.println(day);
			
	}

}
