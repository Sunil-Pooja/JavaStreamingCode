package in.sunil.employee.scenario;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class NoOfMaleAndFemaleEmployees {

	public static void main(String[] args) {

		//How many male and female employees are there in the organization?
		
		List<Employee> noOfMaleAndFemaleEmployees = EmployeeDataGenerator.generateSampleData();
		 Map<String, Long> noOfMaleAndFemaleEmployees1 = noOfMaleAndFemaleEmployees.stream()
				 .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 
		 Set<Entry<String,Long>> entrySet = noOfMaleAndFemaleEmployees1.entrySet();
		 for(Entry<String,Long> set:entrySet) {
			 System.out.println(set.getKey()+" "+set.getValue());
		 }
		 
		 System.out.println(noOfMaleAndFemaleEmployees1);
		

	}

}
