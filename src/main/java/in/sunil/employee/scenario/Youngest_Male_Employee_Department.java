package in.sunil.employee.scenario;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Youngest_Male_Employee_Department {
	
	public static void main(String[] args) {
		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		Optional<Employee> youngest_male = sampleData.stream().filter(e ->e.getGender()=="Male" && e.getDepartment()==" Product Development").min(Comparator.comparing(Employee::getAge));
		System.out.println(youngest_male.get());
	}
}
