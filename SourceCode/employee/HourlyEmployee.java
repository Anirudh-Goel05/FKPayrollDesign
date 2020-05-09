package employee;
import java.util.*;

public class HourlyEmployee extends Employee{
    public TimeRecord myTimeRecord;
    public Date lastPaymentDate;
    private int myRate;
    int paymentDay=5; // For Friday. Can be changed in the future

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
