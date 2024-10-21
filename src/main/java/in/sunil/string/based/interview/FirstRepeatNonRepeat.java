package in.sunil.string.based.interview;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatNonRepeat {

	public static void main(String[] args) {
		
		Optional<Character> firstRepeat =  "abcsdnvsv".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
		if(firstRepeat.isPresent()) {
			System.out.println("First repeating:" + firstRepeat.get());
		}
		
		Optional<Character> firstNonRepeat = "acbasdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter((e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
		if(firstNonRepeat.isPresent()) {
			System.out.println("First Non repeating:  " + firstNonRepeat.get());
		}
		
	}
}
