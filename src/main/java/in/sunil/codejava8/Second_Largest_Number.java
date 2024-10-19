package in.sunil.codejava8;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Second_Largest_Number{

	 static int[] array= {45,25,65,87,88,102,105,108,109,110};

	 public static void main(String[] args) {

		 //1st ways WITH STREAM 
		 List<Integer> asList = Arrays.asList(55, 88, 54, 98, 78, 65);
		 Integer secondMaxNum = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 System.out.println(secondMaxNum);
	 }
	//2nd ways without STREAM
	static int maxSecond() {
		int max1=array[0]; int max2=array[1];
		for(int j=0;j<array.length;j++) {
			if(array[j] > max2) {
				max2=array[j]; 
			}
			if(max2 > max1) { int temp =max1; max1=max2; max2=temp; } }
			return max2; }
}
