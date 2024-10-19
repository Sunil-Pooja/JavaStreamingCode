package in.sunil.employee.scenario;

import java.util.List;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Employee_Salary_GT_20000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		sampleData.stream().filter(e ->e.getSalary()>2000).collect(Collectors.toList()).forEach(System.out::println);	
		
		
		
		//after incresing 10% salary 
	//	sampleData.stream().map(emp->emp.getSalary()*0.1).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
