package in.sunil.string.based.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceKeyValueStringChar {

	public static void main(String[] args) {
		//Occurance as Key Value 
		Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		collect.forEach((x,y) -> System.out.println(x + " Occur: " + y));

	}

}
