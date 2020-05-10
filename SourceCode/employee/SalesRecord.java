package employee;
import java.util.*;


public class SalesRecord{
	private MonthlyEmployee emp;
	ArrayList<SalesReceipt> mySalesReceipts = new ArrayList<SalesReceipt>();
	private Date lastCommissionDate;

	SalesRecord(MonthlyEmployee emp){
		this.emp = emp;
		lastCommissionDate = new Date();
	}

	public void addNewSalesRecord(){
		SalesReceipt newSalesReceipt = new SalesReceipt(this.emp);
		newSalesReceipt.createNewSalesReceipt();
		mySalesReceipts.add(newSalesReceipt);
	}

	public Double getSalesDues(Date dueDate){
		double salesCommision=0d;
		double commissionPercent = emp.getCommisionPercent();
		int i=mySalesReceipts.size()-1;	

		
		while(i>=0 &&  mySalesReceipts.get(i).saleDate.before(dueDate) && mySalesReceipts.get(i).saleDate.after(lastCommissionDate)){
			salesCommision +=  commissionPercent*mySalesReceipts.get(i).getAmount();
			i -=1;
		}
		lastCommissionDate = dueDate;
		return salesCommision;
	}

}	
