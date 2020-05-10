package employee;
import java.util.*;

public class UnionRecords{
	double dueRate;
	double dueAmount;
	double serviceCharge;

	UnionRecords(){
		dueRate = 50;
		dueAmount = 0;
		serviceCharge = 0;
	}
	
	public void postServiceCharge(double serviceCharge){
		this.serviceCharge += serviceCharge;
	}
	public void postWeeklyCharge(){
		dueAmount += dueRate;
	}
	public void setDueRate(double dueRate){
		this.dueRate = dueRate;
	}
	public double getTotalDues(){
		double totalDues = dueAmount + serviceCharge;
		dueAmount = 0;
		serviceCharge = 0;
		return totalDues;
	}
}
