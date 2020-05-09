package employee;
import java.util.*;

public class HourlyEmployee extends Employee{
    private int myRate;
    private int paymentDay = 5;
    private TimeRecord myTimeRecord;

    HourlyEmployee(String name,int age){
    	super(name,age);
    }

    public void setEmployeeDetails(){
    	lastPaymentDate = new Date();
    	myTimeRecord = new TimeRecord(this);
    	System.out.println("New hourly employee created ...\n");
    }

    void createTimeReceipt(){
    	// function to add a new time receipt
    	// TODO Delegate the work to myTimeRecord object
    }
    void setRate(int myRate){
    	this.myRate = myRate;
    }


}
