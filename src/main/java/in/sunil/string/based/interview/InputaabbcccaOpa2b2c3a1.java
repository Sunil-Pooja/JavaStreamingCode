package in.sunil.string.based.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* write a program to find run lenth Encoding for string 
  *  input :  aabbccca
  *  output : a2b2c3a1
*/
public class InputaabbcccaOpa2b2c3a1 {

	public static void main(String[] args) {

		//1st Program 
		String str="aabbccca";
		String result="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				result=result+str.charAt(0);
				count++;
			}
			if((i !=0) && (str.charAt(i)== str.charAt(i-1))){
				count++;
			}
			else if((i !=0) && (str.charAt(i)!= str.charAt(i-1))) {
				
				result=result+count+str.charAt(i);
				count=1;
			}
			if(i==str.length()-1){
				result=result +count;
			}
		}
		System.out.println("---Result =>>>>>>>>>>>>"+result);
		
		//2nd Program 
		String str2 = "aabbcccddda";

		String collect2 = str2.chars() .mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,Collectors.counting())) .entrySet() .stream()
				.flatMap(entry -> Stream.of(entry.getValue().toString(),
						entry.getKey().toString())) .collect(Collectors.joining());

		System.out.println(collect2);
		
	}
	
	

	

	
	
}

