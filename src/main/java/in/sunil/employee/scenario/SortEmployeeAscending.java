package in.sunil.employee.scenario;

import java.util.Comparator;
import java.util.List;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class SortEmployeeAscending {
	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeDataGenerator.generateSampleData(); 
		employeeList.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.forEach(e ->System.out.println(e.getName()+"  "+e.getSalary()));
	}
}
