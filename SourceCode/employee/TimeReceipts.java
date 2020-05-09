package employee;
import java.util.*;

public class TimeReceipts{
	private int hours;
	private HourlyEmployee emp;
	Date date;

	TimeReceipts(HourlyEmployee emp){
		this.emp = emp;
	}

	public void createNewTimeReceipt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of hours:");
		this.hours = sc.nextInt();
		this.date = new Date();	
	}

	public String toString(){
		String myString = emp.toString() + ": [" + "Hours: " + hours + " Date:" + date + "]";
		return myString;
	}
	public Double getPayment(){
		Double total=0d;
		int empRate = emp.getMyRate();
		total += empRate * Math.min(hours,8);
		hours -= 8;
		total += (1.5*empRate) * Math.max(hours,0);
		return total;
	}
}