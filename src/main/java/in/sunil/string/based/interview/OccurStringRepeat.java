package in.sunil.string.based.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurStringRepeat {

	public static void main(String[] args) {
		
		List<String> listdemo=Arrays.asList("saradhi","bill","mike","Bill","MIKE");
		   
	    Map<String, Long> collect = listdemo.stream().map(s->s.toLowerCase()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
	  
	    System.out.println("collector printing is : "+collect);
	    
	    String s="asdfasf";
	}
}
