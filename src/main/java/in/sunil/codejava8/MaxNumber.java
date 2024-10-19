package in.sunil.codejava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxNumber {

	public static void main(String[] args) {
		//1st ways 
		int[] intArray= {32,43,55,54,98,89,79};
		int intMax = Arrays.stream(intArray).max().getAsInt();
		
		System.out.println(intMax);
	
		//2nd ways 
		List<Integer> list = Arrays.asList(32,43,55,54,98,89,79);
		Integer listMax = list.stream().max(Comparator.naturalOrder()).get();
		
		//3nd ways 
		Integer listMax_rev = list.stream().min(Comparator.reverseOrder()).get();
		
	    System.out.println(listMax);
	    System.out.println(listMax_rev);
    
	}
}
