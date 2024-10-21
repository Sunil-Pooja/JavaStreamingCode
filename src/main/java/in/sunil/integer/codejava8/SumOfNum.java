package in.sunil.integer.codejava8;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

public class SumOfNum {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(5,4,6,7,1,2,3,8,9);//48
			
		Optional<Integer> optional = list.stream().reduce((a,b)-> a+b);
		
		System.out.println("Sum of small letter:-> "+optional.get());
		
		Optional<Integer> op = list.stream().map(a->a*a).reduce((a,b)->a+b).filter(a ->a%2==0);
		//if(op)
		System.out.println(op.get());
	}

}
