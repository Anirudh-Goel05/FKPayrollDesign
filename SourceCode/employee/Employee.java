package employee;

public class Employee{
	private String name;
	private int age;
	private int empNumber;
	private static int totalEmp;

	Employee(){
		totalEmp += 1;
		empNumber  = totalEmp;
	}	
	Employee(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}
	
}
