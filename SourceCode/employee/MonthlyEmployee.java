package employee;
import java.util.*;


public class MonthlyEmployee extends Employee{
	SalesRecord mySalesRecord;
	UnionRecords myUnionRecord;
	private double commissionPercent;
	private int monthlySalary = 0;
	private int salesPayDay = 5;

	MonthlyEmployee(String name,int age){
		super(name,age);
		commissionPercent = 0.10;
		this.name = this.name + this.empNumber;
		this.age = this.age + this.empNumber;
		lastPaymentDate = new Date();
		mySalesRecord = new SalesRecord(this);
		myUnionRecord = new UnionRecords();
	}
	public double getCommisionPercent(){
		return commissionPercent;
	}

	public void setEmployeeDetails(){
		// TODO To set Employee Details
	}
	
	public Double getTotalDues(Date dueDate){
		// TODO add all the dues for a monthly employee
		System.out.println("Monthly employee ---");
		return 0d;
	}

	public Double getSalesDues(Date dueDate){
		if(dueDate.getDay() == salesPayDay){
			return mySalesRecord.getSalesDues(dueDate);
		}
		return 0d;
	}
	

	public void createSalesRecord(){
		mySalesRecord.addNewSalesRecord();
	}

}