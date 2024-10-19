package in.sunil.codejava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of integers, separate odd and even numbers?

public class Test {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(71,82,45,66,25,98,87,100,16,5,105,108,109,110);
		//Even Number 
	 	list.stream().filter(i->i%2==0).forEach(System.out::println);
		
		//Find maximum number -1st way
		Integer integer = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("largestNumber -1st ways !!!!!-->"+integer);
		//Find maximum number 2st way
		
		Integer largestNumber=list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("largestNumber 2nt ways !!!!!-->"+largestNumber);
		System.out.println("-------------------------------!!!!!!!!!!!!!!!!");
		Optional<Integer> largestNumberth = list.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst();
		System.out.println("largestNumber 3nt ways !!!!!-->"+largestNumberth);
		
		
		
		
	}
}
