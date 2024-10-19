package in.sunil.employee.scenario;

import java.util.List;

import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Increment_10_percent_Salary {
	
	public static void main(String[] args) {
		
		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		sampleData.stream().filter(e -> e.getSalary()<24000).map((emp-> emp.getSalary()*1.10 )).forEach(System.out::println);;
	
	}

}
