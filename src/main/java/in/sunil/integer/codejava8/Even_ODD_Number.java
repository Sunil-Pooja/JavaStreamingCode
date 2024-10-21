package in.sunil.integer.codejava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_ODD_Number {

	public static void main(String[] args) {

		//Even Number 
		List<Integer> list = Arrays.asList(5,4,6,7,1,2,3,8,9);//45/9
		List<Integer> collect = list.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(collect+" : Even Number ");
	}

}
