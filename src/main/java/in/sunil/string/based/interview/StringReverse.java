package in.sunil.string.based.interview;

import java.util.Arrays;
import java.util.stream.Collectors;
// Question -1 Reverse String First to Last place changing place 
// QUestion -2 Reverse String reverse without place change using stream 	
/* Question 3
 * input-   "This is an interview question" 
 * output - "question interview an is this"
 */				

public class StringReverse {
	public static void main(String[] args){
		//Question 1
		String str="SUNIL KUMAR RAM";
		StringBuilder builder=new StringBuilder(str).reverse();
		System.out.println(builder);//MAR RAMUk LINUS

		String reverseNew=Arrays.stream(str.split(" ")).map(str1->new StringBuilder(str1).reverse()).collect(Collectors.joining(""));
		System.out.println("reverseNew!!"+reverseNew);//LINUS RAMUK MAR
		
		
		String[] words =  "This is interview question".split(" ");
		String rev = "";
		for(int i = words.length - 1; i >= 0 ; i--)
		{
			rev += words[i] + " ";
		}
		System.out.println(rev+" Rev ");
		// rev = "question interview is This "

		// can also use StringBuilder:
		StringBuilder revb = new StringBuilder();
		for(int i = words.length - 1; i >= 0 ; i--)
		{
			revb.append(words[i]);
			revb.append(" ");
		}
		System.out.println(revb);
	}
}
