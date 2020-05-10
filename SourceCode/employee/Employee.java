package employee;
import java.util.*;

abstract public class Employee{
	protected String name;
	protected int age;
	protected int empNumber;
	private static int totalEmp=0;
	protected Date lastPaymentDate;
	protected UnionRecords myUnionRecord;

	Employee(){
		totalEmp += 1;
		empNumber  = totalEmp;
	}	
	Employee(String name,int age){
		this();
		this.name = name;
		this.age = age;
	}

	public String toString(){
		String rs = "[ID: " + empNumber +  " Name: " + name +" , Age: " + age +" ]";
		return rs;
	}
	abstract public void setEmployeeDetails();
	abstract public Double getTotalDues(Date dueDate);
	// public boolean changeDetails();
	// Double getPayment();  
	
}
