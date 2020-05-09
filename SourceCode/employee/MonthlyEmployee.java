package employee;
import java.util.*;


public class MonthlyEmployee extends Employee{
	private SalesRecord mySalesRecord;
	private UnionRecords myUnionRecord;

	MonthlyEmployee(String name,int age){
		super(name,age);
	}

	public void setEmployeeDetails(){
		lastPaymentDate = new Date();
		mySalesRecord = new SalesRecord(this);
		System.out.println("New Monthly employee created ...\n");
	}

}