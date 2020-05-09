package employee;
import java.util.*;

abstract public class Employee{
	protected String name;
	protected int age;
	protected int empNumber;
	private static int totalEmp;
	protected Date lastPaymentDate;

	Employee(){
		totalEmp += 1;
		empNumber  = totalEmp;
	}	
	Employee(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}

	public String toString(){
		String rs = "[Name: " + name +" , Age: " + age +" ]";
		return rs;
	}
	abstract public void setEmployeeDetails();

	// public boolean changeDetails();
	// Double getPayment();  

}
