package in.sunil.integer.codejava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,4,6,7,1,2,3,8,9);//45/9
		double asDouble = list.stream().mapToInt(a->a).average().getAsDouble();
		System.out.println(asDouble);//
	}
}
