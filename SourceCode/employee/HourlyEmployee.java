package employee;
import java.util.*;

public class HourlyEmployee extends Employee{
    private int myRate;
    private int paymentDay = 6;
    public TimeRecord myTimeRecord;

    HourlyEmployee(String name,int age){
    	super(name,age);
    	this.myTimeRecord = new TimeRecord(this);
    	lastPaymentDate = new Date();	
    	this.myRate = 300;
    	this.name = this.name + ": " + empNumber;
    	this.age = this.empNumber + 20;
    }
    
    public void setEmployeeDetails(){
    	// System.out.println("New hourly employee created ...\n");
    }

    void createTimeReceipt(){
    	// function to add a new time receipt
    	// TODO Delegate the work to myTimeRecord object
    	myTimeRecord.addNewTimeReceipt();
    }
    void setRate(int myRate){
    	this.myRate = myRate;
    }
    public int getMyRate(){
    	return this.myRate;
    }

    public Double getTotalDues(Date dueDate){
    	if(dueDate.getDay() != paymentDay){
    		return 0d;
    	}

		double weeklyWage = 0d;
		weeklyWage += myTimeRecord.getTotalDues(dueDate);
    	// TODO 
    	// Deduct charges from Union
    	this.lastPaymentDate = dueDate;
    	return weeklyWage;
    }

}
