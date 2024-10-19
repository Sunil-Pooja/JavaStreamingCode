package in.sunil.codejava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> list_Integer = Arrays.asList(1,5,6,1,2,5,6,9,8,7,6,10,20,10);
		 
		 //Natural Sorting order 
		// list_Integer.stream().distinct().sorted().forEach(System.out::println);	 
		 
		 //Reverse Order 
		 list_Integer.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 
	}

}
