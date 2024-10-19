package in.sunil.employee.scenario;

import java.util.List;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

/*
 * 
 * Given a list of `Employee` objects, filter and retrieve 
 * all male employees in the “Engineering” department using Java 8 Streams.
 */
public class FilteringEmployees {
	
	public static void main(String[] args) {
		
		  List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
          
		  employeeList.stream()
		  		.filter(e -> e.getGender().equalsIgnoreCase("male") && e.getDepartment()
				.equalsIgnoreCase("Engineering"))
		  		.forEach(e-> System.out.println(e.getName()));
	}

}