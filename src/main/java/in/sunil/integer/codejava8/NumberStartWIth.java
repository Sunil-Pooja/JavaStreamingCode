package in.sunil.integer.codejava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWIth {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(25,4,26,70,87,112,21,78,73,8,92);//48
		// 25 26 21
		List<Integer> startWith2 = list.stream()
				.map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(startWith2);
	}

}
