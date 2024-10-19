package in.sunil.string.based.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> list_String = Arrays.asList("Radha", "Krishna", "Amit", "Pooja", "Balu", "Monu");

		 List<String> final_String = list_String.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 System.out.println(final_String+"");
	}

}
