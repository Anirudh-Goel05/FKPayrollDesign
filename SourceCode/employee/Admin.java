package employee;
import java.util.*;

public class Admin{
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	
	public static boolean addEmployee(){
		Employee emp1 = new Employee("Anirudh",10);
		Employee emp2 = new Employee("Anuradha",20);
		
		employeeList.add(emp1);
		employeeList.add(emp2);

		for(Employee e:employeeList){
			System.out.println(e);
		}
		return true;
	}

	public static void main(String[] args) {
		addEmployee();
	}
}