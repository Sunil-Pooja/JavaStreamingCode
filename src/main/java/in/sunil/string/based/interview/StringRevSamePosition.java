package in.sunil.string.based.interview;

import java.util.Arrays;
import java.util.List;

import java.util.Spliterator;
import java.util.stream.Collectors;

public class StringRevSamePosition {

	public static void main(String[] args) {
		String s = "Sunil Pooja";
		
		String collect2 = Arrays.stream(s.split(" ")).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect2);
	}

}
