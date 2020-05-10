package employee;
import java.util.*;

public class HourlyEmployee extends Employee{
    public TimeRecord myTimeRecord;
    private int myRate;
    static int paymentDay=0; // For Friday. Can be changed in the future

    HourlyEmployee(String name,int age){
    	super(name,age);
    	this.myTimeRecord = new TimeRecord(this);
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
    	double weeklyWage = 0d;
		weeklyWage += myTimeRecord.getTotalDues(dueDate);
    	// TODO 
    	double unionDues = 0d;
        if(this.myUnionRecord != null)
         unionDues = myUnionRecord.getTotalDues();

        System.out.println(this.name + ": Weekly-wage:" + weeklyWage + " unionDues: " + unionDues);
    	this.lastPaymentDate = dueDate;
        weeklyWage -= unionDues;
    	return weeklyWage;
    }

}
