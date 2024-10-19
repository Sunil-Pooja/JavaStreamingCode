package in.sunil.employee.scenario;
import java.util.List;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Average_Age_Male_Female {
	public static void main(String[] args) {
		List<Employee> listOfEmp = EmployeeDataGenerator.generateSampleData();
		Map<String, Double> collect = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		
		Set<Entry<String,Double>> entrySet = collect.entrySet();
		for(Entry<String,Double> set:entrySet) {
			
			System.out.println(set.getKey()+" "+set.getValue());
		}
		
	}
}
