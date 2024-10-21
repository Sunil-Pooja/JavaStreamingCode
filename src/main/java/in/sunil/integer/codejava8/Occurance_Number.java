package in.sunil.integer.codejava8;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Occurance_Number {

	public static void main(String[] args) {

		//1st ways with java 8 stream concept with arrays Int
		int array[]= {1,5,6,1,2,5,6,9,8,7,6,10,20,10};
		Arrays.stream(array).boxed().collect(Collectors.groupingBy(s -> s))
		.forEach((k, v) ->
		System.out.println("The Number "+k+" Occur  "+v.size()+" Times"));
		System.out.println();
		
		System.out.println("2nd ways with java 8 without array int  ");
		System.out.println();
		
		// 2nd ways with java 8 without array int 
		List<Integer> listNum=Arrays.asList(1,5,6,1,2,5,6,9,8,7,6,10,20,10);

		listNum.stream().sorted().collect(Collectors.groupingBy(s->s))
		.forEach((k,v)->System.out.println("The Number "+k+" Occur  "+v.size()+" Times"));

		// 3nd ways without java 8 and HashSet 
		HashSet<Integer> hs=new HashSet<>();
		int lengh=array.length;
		System.out.println(lengh+" Length");//14
		for(int i=0;i<lengh;i++) {
			hs.add(array[i]);
		}
		System.out.println("Final Array!!!"+hs);
		System.out.println("Final Array size!!!"+hs.size());//9
		for(int put:hs){
			int no=0;
			for(int j=0;j<lengh;j++) {
				//	System.out.println(j+" j value ");
				if(put==array[j]) {
					//System.out.println(put+" Inside if condition ");
					no++;
				}
			}
			System.out.println("The Number "+put+" Occur "+no+" times");
		}
	}
}
