package employee;
import java.util.*;

public class Admin{
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	
	public static void addHourlyEmployee(){
		Employee emp = new HourlyEmployee("Ramu",20);
		emp.setEmployeeDetails();
		employeeList.add(emp);
	}

	public static void addMonthlyEmployee(){
		Employee emp = new MonthlyEmployee("Anirudh",30);
		emp.setEmployeeDetails();
		employeeList.add(emp);
	}

	public static void printAllEmployees(){
		for(Employee emp: employeeList){
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {
		addHourlyEmployee();
		addMonthlyEmployee();
		printAllEmployees();
	}
}