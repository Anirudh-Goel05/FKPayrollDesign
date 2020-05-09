package employee;
import java.util.*;

public class TimeRecord{
	private static ArrayList<TimeReceipts> myTimeReceipts = new ArrayList<>();
	private Employee emp;

	TimeRecord(Employee emp){
		this.emp = emp;
	}

	// boolean addNewTimeReceipt(){
	// 	TimeReceipts newTimeReceipt = new TimeReceipts(emp);
	// 	boolean rval = newTimeReceipt.createNewTimeReceipt();
	// 	if(rval == false){return false;}
	// 	myTimeReceipts.add(newTimeReceipt);
	// 	return true;
	// }

	// Double getTimeRecordsPayment(Date date){
	// 	Double totalPayment = 0d;
	// 	for(int i=myTimeReceipts.size()-1;i>=0;i--){
	// 		TimeReceipts curTimeReceipt = myTimeReceipts.get(i);
			
	// 	}
	// }

}