package in.sunil.employee.scenario;

import java.util.List;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Get_All_Department {

	public static void main(String[] args) {
		
		List<Employee> getAllDept = EmployeeDataGenerator.generateSampleData();
		//Approach -01
		getAllDept.stream()
		.map(d ->d.getDepartment()).distinct().forEach(System.out::println);
		
		List<String> list = getAllDept.stream()
		.map(d ->d.getDepartment()).distinct().collect(Collectors.toList());
		
		System.out.println(list);
	}

}
