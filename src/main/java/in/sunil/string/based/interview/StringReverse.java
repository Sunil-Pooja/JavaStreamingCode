package in.sunil.string.based.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {
	public static void main(String[] args){
		//Question 1
		String str="SUNIL KUMAR RAM";
		StringBuilder builder=new StringBuilder(str).reverse();
		System.out.println(builder);//MAR RAMUk LINUS
		
		//QUestion 2
		String reverseNew=Arrays.stream(str.split(" ")).map(str1->new StringBuilder(str1).reverse()).collect(Collectors.joining(""));
		System.out.println("reNew!!"+reverseNew);//LINUS RAMUK MAR
		//Other interview question 
		
		//Question 3 
		/* Input:  This is an interview question
		 * output: This is an inteview noitseuq
		 *  
		 *  */
		String[] words =  "This is a test sentence".split(" ");
		String rev = "";
		StringBuilder buil=null;
		for(int i = words.length-1; i >= 0 ; i--)
		{
			if(words[i].equalsIgnoreCase("sentence")) {
			    builder=new StringBuilder("sentence").reverse();
			    rev += builder + " ";
			}else {
				System.out.println("Dummy "+words[i]);
				rev = words[i] + " "+rev;
			}
		}
		System.out.println(rev+" Rev ");
		//Question 4 approach
		StringBuilder revb = new StringBuilder();
		for(int i = words.length - 1; i >= 0 ; i--)
		{
			revb.append(words[i]);
			revb.append(" ");
		}
		System.out.println(revb);
	}
}
