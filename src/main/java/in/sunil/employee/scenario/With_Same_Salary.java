package in.sunil.employee.scenario;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class With_Same_Salary {

	public static void main(String[] args) {


		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		
		Map<Double, Set<String>> collect = sampleData.stream()
				.collect(Collectors.groupingBy(Employee::getSalary,Collectors.mapping(Employee::getName,Collectors.toSet())));
		
		Set<Entry<Double,Set<String>>> entrySet = collect.entrySet();
		
		for(Entry<Double,Set<String>> set:entrySet) {
			
			System.out.println(set);
			
		}

	}

}
