package employee;
import java.util.*;


public class MonthlyEmployee extends Employee{
	SalesRecord mySalesRecord;
	private double commissionPercent;
	private int monthlySalary = 0;
	static int salesPayDay = 6;

	MonthlyEmployee(String name,int age){
		super(name,age);
		commissionPercent = 0.10;
		this.name = this.name + this.empNumber;
		this.age = this.age + this.empNumber;
		monthlySalary=100*this.age;
		lastPaymentDate = new Date();
		mySalesRecord = new SalesRecord(this);
	}
	public double getCommisionPercent(){
		return commissionPercent;
	}

	public void setEmployeeDetails(){
		// TODO To set Employee Details
	}
	
	public Double getTotalDues(Date dueDate){
		// TODO add sales payment
		double totalDues = 0d;
		totalDues += monthlySalary;
		double unionDues = 0d;
		if(myUnionRecord != null){
			unionDues =  myUnionRecord.getTotalDues();
		}
		System.out.println(this.toString() + " Salary: " + totalDues + " UnionDues: " + unionDues );
		totalDues -= unionDues;
		return totalDues;
	}

	public Double getSalesDues(Date dueDate){
		return mySalesRecord.getSalesDues(dueDate);
	}
	

	public void createSalesRecord(){
		mySalesRecord.addNewSalesRecord();
	}

}