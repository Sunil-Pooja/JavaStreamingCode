package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringRevSamePosition {
	public static void main(String[] args) {
		String s = "Rahdhe Krishna";
		
		String collect2 = Arrays.stream(s.split(" ")).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect2);
		
	}
}
