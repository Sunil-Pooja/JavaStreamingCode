package in.sunil.string.based.interview;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
/* Find First occurance in java 
 * input : babababssa
 * output : b
 * 
 * */


public class FirstRepeatNonRepeatNOccurStringCharacter {

	
	public static void main(String[] args) {
		
		//First APproach

		//String.chars() will give -IntStream
		//set.add() will return false if element is already in the set
		// So ... filter(i -> !seen.add(i)) is filtering out characters that were not in seen;
		//i.e. ones that aren't duplicate.
		//The first() gives us the first duplicate ... or an empty optional.
		//We need to cast the resulting int to a char to print it as a character.
		String s = "babababssa";
		Set<Integer> set = new HashSet<>();
		 OptionalInt first = s.chars().filter(i -> !set.add(i))
				.findFirst();
		if (first.isPresent()) {
			System.out.println((char)first.getAsInt());//
		}
		//--------------------------------Same output -1st Approach---------------------------------------------
		//Occurance as Key Value 
		Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));
		//---------------------------------------------------2nd Approach-------------------------------------------
		//Occurance as Key Value 
		String str = "PoojaKumariPooja";
		LinkedHashMap<String,Long> key_Value = 
				 Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));	
		key_Value.forEach((x,y) -> System.out.println( "KeyNew: " + x + " Val:New " + y));
		//------------------------------------------------------------------------------------------------
		//First non repeating
		Optional<Character> firstNonRepeat = "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
		if(firstNonRepeat.isPresent()) {
			System.out.println("First non repeating:" + firstNonRepeat.get());
		}
		
		/*
		 * String input = "stackoverflow"; Character nonRepeatChar =
		 * input.chars().mapToObj(c -> Character.valueOf((char) c))
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 * // Finding the character count
		 * .entrySet().stream().sorted(Map.Entry.comparingByValue()) //Sorted by
		 * character count value .map(entry -> entry.getKey()).findFirst().get();
		 * //Returning the first value
		 */		
		
		//First repeating
		//2nd Approach
		Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
		System.out.println("First repeating:" + firstRepeat.orElse(null));
		
		
		
	}}
