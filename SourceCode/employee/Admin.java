package employee;
import java.util.*;

public class Admin{
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	private static ArrayList<HourlyEmployee> hourlyEmployeeList = new ArrayList<>();
	private static ArrayList<MonthlyEmployee> monthlyEmployeeList = new ArrayList<>();
	
	public static void addHourlyEmployee(){
		HourlyEmployee emp = new HourlyEmployee("Ramu",20);
		emp.setEmployeeDetails();
		employeeList.add(emp);
		hourlyEmployeeList.add(emp);
	}

	public static void addMonthlyEmployee(){
		MonthlyEmployee emp = new MonthlyEmployee("Anirudh",30);
		emp.setEmployeeDetails();
		employeeList.add(emp);
		monthlyEmployeeList.add(emp);
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

	public static void getSalesDues(Date dueDate){
		double totalSalesDues = 0;
		System.out.println("Calulcating sales due....");
		for(MonthlyEmployee e:monthlyEmployeeList){
			double due = e.getSalesDues(dueDate);
			System.out.println(e + ": "  + due + " " + e.mySalesRecord.mySalesReceipts.size());
			totalSalesDues += due;
		}
		System.out.println(totalSalesDues);
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
		monthlyEmployeeList.get(0).createSalesRecord();
		monthlyEmployeeList.get(1).createSalesRecord();
		addMonthlyEmployee();
		monthlyEmployeeList.get(2).createSalesRecord();
		getSalesDues(new Date());
		// System.out.println( monthlyEmployeeList.get(0).mySalesRecord.mySalesReceipts.size() );
		// System.out.println( ((MonthlyEmployee)(employeeList.get(2))).mySalesRecord.mySalesReceipts.size() );
		// System.out.println( monthlyEmployeeList.get(1).mySalesRecord.mySalesReceipts.size() );
		// System.out.println( ((MonthlyEmployee)(employeeList.get(3))).mySalesRecord.mySalesReceipts.size() );
		
	}
}