package in.sunil.codejava8;

import java.util.Arrays;
import java.util.List;

public class SquareGreaterthanAverageNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,8,6,5,3,4,9,2);//64+81=145=72.5
		double square_Greaterthan_Average = list.stream()
								.map(e -> e*e).filter(e -> e>36)
								.mapToInt(e -> e)
								.average()
								.getAsDouble();
		
		System.out.println(square_Greaterthan_Average);
	}
}
