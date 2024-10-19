package in.sunil.equals_hashcode;

import java.util.HashSet;

public class HashcodeEqualsImpl {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("rajeev", 24);
		Employee employee2 = new Employee("rajeev", 25);
		Employee employee3 = new Employee("rajeev", 24);

		System.out.println("e1 e3 "+employee1.equals(employee3));//false in not overrride equals method()
		System.out.println("e1 e2 "+employee1.equals(employee2));//false
		
		System.out.println();//false
		
		HashSet<Employee> employee12=new HashSet<Employee>();
		employee12.add(employee1);
		
		System.out.println("e12 e1 "+employee12.contains(employee1));//true in case not override hashcode 
		System.out.println("e12 e2 "+employee12.contains(employee2));//False in case override hashcode or not
		System.out.println("e12 e3 "+employee12.contains(employee3));//False in case not override equals ()
		
		System.out.println("employee12.contains(employee2!!!!"+employee12.contains(employee3));//True in case override equals()
		////different hashcode in case not override hashcode()
		System.out.println("Empl 1 Hc:"+employee1.hashCode());//932583850
		System.out.println("Empe 2 Has::"+employee2.hashCode());//212628335
		System.out.println("Emp 3 Hash:"+employee3.hashCode());//1579572132
		
		//=================Same Below hashCode in case Overrring hashcode ===============================
		

		System.out.println("Empl 1 Has::"+employee1.hashCode());//938387308
		System.out.println("E3 Hashc:"+employee3.hashCode());//938387308
		//=================Same above hashCode in case Overrring hashcode ===============================
		
		System.out.println();
		
		/*
		 * Incase of overrding both equals and hashcode methos below output
		   e1 e3::::::::::true
				e1 e3 true
				e1 e2 false
				
				e12 e1 true
				e12 e2 false
				e12 e3 true
				
				employee12.contains(employee2!!!!true
				Empl 1 Hc:-938387308
				Empe 2 Has::-938387277
				Emp 3 Hash:-938387308
				Empl 1 Has::-938387308
				E3 Hashc:-938387308

e12 e1 true
e12 e2 false
e12 e3 false
		 */
	}
}
