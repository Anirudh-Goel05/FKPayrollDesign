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

	public static void getAllDues(Date dueDate){
		// Get total payment dues
		System.out.println("\nCalculating Total Dues till Date:" + dueDate + ".....");
		for(Employee e:employeeList){
			Double dues = e.getTotalDues(dueDate);
			System.out.println("Id: " + e.empNumber +  " Dues: " +  dues);
		}
	}

	
	
	public static void main(String[] args) {
		// Create some employees
		addHourlyEmployee();
		addHourlyEmployee();
		addMonthlyEmployee();
		addMonthlyEmployee();

		printAllEmployees();
		
		

		// ------------ This piece is to add Time Records and then test them -------------------
		// Add time receipt
		// ((HourlyEmployee)(employeeList.get(0))).createTimeReceipt();
		// ((HourlyEmployee)(employeeList.get(1))).createTimeReceipt();
		// System.out.println( ((HourlyEmployee)(employeeList.get(0))).myTimeRecord.myTimeReceipts.size() );
		// System.out.println( ((HourlyEmployee)(employeeList.get(1))).myTimeRecord.myTimeReceipts.size() );
				
		// Date dueDate = new Date();
		// getAllDues(dueDate);

		// ------------------------- END ---------------------------------


		// ---------------- This piece is to add SalesRecords and then test them --------------------
		((MonthlyEmployee)(employeeList.get(2))).createSalesRecord();
		((MonthlyEmployee)(employeeList.get(3))).createSalesRecord();
		((MonthlyEmployee)(employeeList.get(3))).createSalesRecord();
		((MonthlyEmployee)(employeeList.get(3))).createSalesRecord();

		System.out.println( ((MonthlyEmployee)(employeeList.get(2))).mySalesRecord.mySalesReceipts.size() );
		System.out.println( ((MonthlyEmployee)(employeeList.get(3))).mySalesRecord.mySalesReceipts.size() );
		

	}
}