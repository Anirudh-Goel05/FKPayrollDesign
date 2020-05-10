package employee;
import java.util.*;

public class TimeRecord{
	public ArrayList<TimeReceipts> myTimeReceipts = new ArrayList<>();
	private HourlyEmployee emp;
	Date prevPaymentDay;
	
	TimeRecord(HourlyEmployee emp){
		this.emp = emp;
		prevPaymentDay = new Date();
	}

	public void addNewTimeReceipt(){
		TimeReceipts newTimeReceipt = new TimeReceipts(emp);
		newTimeReceipt.createNewTimeReceipt();
		myTimeReceipts.add(newTimeReceipt);
		// System.out.println("New Receipt Added: " + newTimeReceipt);
	}

	public double getTotalDues(Date dueDate){
		double weeklyWage=0d;
		int i=myTimeReceipts.size()-1;
		while(i>=0 &&  myTimeReceipts.get(i).date.before(dueDate) && myTimeReceipts.get(i).date.after(prevPaymentDay)){
			weeklyWage += myTimeReceipts.get(i).getPayment();
			i -=1;
		}
		// System.out.println(emp + "Size:" + myTimeReceipts.size() + "i: " +  i);
		// for(TimeReceipts tr:myTimeReceipts){
		// 	System.out.print(tr +"--");
		// }
		prevPaymentDay = dueDate;
		return weeklyWage;
	}

	// Double getTimeRecordsPayment(Date date){
	// 	Double totalPayment = 0d;
	// 	for(int i=myTimeReceipts.size()-1;i>=0;i--){
	// 		TimeReceipts curTimeReceipt = myTimeReceipts.get(i);
			
	// 	}
	// }

}