package in.sunil.employee.scenario;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Average_salary_each_depart {
	public static void main(String[] args) {
		List<Employee> listOfEmp = EmployeeDataGenerator.generateSampleData();

		Map<String, Double> average_salry = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String,Double>> entrySet = average_salry.entrySet();
		for(Entry<String,Double> set:entrySet) {
			System.out.println(set.getKey()+" "+set.getValue());

		}
	}
}
