package in.sunil.employee.scenario;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Count_Emp_No_Each_Depart {

	public static void main(String[] args) {

		List<Employee> sampleData = EmployeeDataGenerator.generateSampleData();
		Map<String, Long> department = sampleData.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		Set<Entry<String,Long>> entrySet = department.entrySet();

		for(Entry<String,Long> set: entrySet) {
			System.out.println(set.getKey()+" "+set.getValue()); }

		System.out.println(department);
	}
}
