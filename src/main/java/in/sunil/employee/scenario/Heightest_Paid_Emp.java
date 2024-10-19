  package in.sunil.employee.scenario;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import in.sunil.domain.Employee;
import in.sunil.domain.EmployeeDataGenerator;

public class Heightest_Paid_Emp {
	
	
	public static void main(String[] args) {
		
		  List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
		  Optional<Employee> heightest_paid_salary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		  Employee employee = heightest_paid_salary.get() ; 
		  
		  System.out.println("heightest_paid_salary.get(); "+heightest_paid_salary.get());
		  System.out.println(employee.getName()+" Name");
		  System.out.println(employee.getSalary()+" salary ");
		  System.out.println(employee.getDepartment()+" Departement ");
		  System.out.println(employee.getAge()+" Age ");
		  System.out.println(employee.getGender()+" Gender ");
		  System.out.println(employee.getYearOfJoining()+" Date of Joining ");   
	}
}