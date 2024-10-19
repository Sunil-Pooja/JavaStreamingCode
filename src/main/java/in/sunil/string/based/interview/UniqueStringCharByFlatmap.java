package in.sunil.string.based.interview;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueStringCharByFlatmap {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("apple", "banrry");
		List<Character> collect = strings.stream()
        .flatMap(str -> str.chars().mapToObj(c -> (char) c))  //Stream<Character>
        .distinct()  // Remove duplicates
        .collect(Collectors.toList());
		
		System.out.println("Unique Characters: " + collect);
	}

}
