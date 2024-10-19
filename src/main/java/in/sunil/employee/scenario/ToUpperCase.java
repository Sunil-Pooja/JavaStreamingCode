package in.sunil.employee.scenario;

import java.util.List;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class ToUpperCase {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
		employeeList.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);
	}
}
