package in.sunil.employee.scenario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_ArrayListwith_Male_Female {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list_male=Arrays.asList("male","female","male","female","male","female","male","female");
		//Male 
		list_male.stream().filter("male"::equalsIgnoreCase).forEach(System.out::println);
		
		//Female
		list_male.stream().filter("female"::equalsIgnoreCase).forEach(System.out::println);
		
		// both male and female 
		list_male.stream().filter(s ->s.equalsIgnoreCase("male") || s.equalsIgnoreCase("female")).forEach(System.out::println);;
	}

}
