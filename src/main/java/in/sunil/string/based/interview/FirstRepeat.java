package in.sunil.string.based.interview;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/* String.chars() will give -IntStream
	set.add() will return false if element is already in the set
	So ... filter(i -> !seen.add(i)) is filtering out characters that were not in seen;
	i.e. ones that aren't duplicate.
	The first() gives us the first duplicate ... or an empty optional.
	We need to cast the resulting int to a char to print it as a character.
*/
public class FirstRepeat {

	public static void main(String[] args) {
		//Approach 1
		String s = "abcsdnvsv";
		Set<Integer> set = new HashSet<>();
		OptionalInt first = s.chars().filter(i -> !set.add(i))
				.findFirst();
		if (first.isPresent()){
			System.out.println((char)first.getAsInt());//
		} 
		//Approach 2
		Optional<Character> firstRepeat =  "abcsdnvsv".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
		if(firstRepeat.isPresent()) {
			System.out.println("First repeating:" + firstRepeat.get());
		}
	}

}
