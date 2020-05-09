package employee;
import java.util.*;

public class TimeReceipts{
	private int hours;
	private Employee emp;
	Date date;

	TimeReceipts(Employee emp){
		this.emp = emp;
	}

	// public boolean createNewTimeReceipt(){
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.println("Enter number of hours:");
	// 	hours = sc.nextInt();
	// 	System.out.println("Enter the date:");	
	// 	date = new Date(sc.nextLine());
	// 	return true;
	// }

	// public Double getTimeReceiptPayment(){
	// 	Double total=0.0D;
	// 	total += emp.myRate * Math.min(hours,8);
	// 	hours -= 8;
	// 	total += (1.5*emp.myRate) * Math.max(hours,0);
	// 	return total;
	// }
}