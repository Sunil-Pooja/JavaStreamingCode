package in.sunil.employee.scenario;

import java.util.List;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Get_Employee_After_2015 {
	
	public static void main(String[] args) {

		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		List<Employee> year_Of_Joining= sampleData.stream().filter(e-> e.getYearOfJoining()> 2015).collect(Collectors.toList());
		//System.out.println(year_Of_Joining);

		//	List<Employee> salary= sampleData.stream().filter(e-> e.getSalary()> 25000).collect(Collectors.toList());

		sampleData.stream().filter(e->e.getSalary() >28900).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
