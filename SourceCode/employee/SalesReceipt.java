package employee;
import java.util.*;

public class SalesReceipt{
	private MonthlyEmployee emp;
	Date saleDate;
	private Double amount;

	SalesReceipt(MonthlyEmployee emp){
		this.emp = emp;
	}

	public void createNewSalesReceipt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount:");
		this.amount = sc.nextDouble();
		this.saleDate = new Date();	
	}

	public Double getAmount(){
		return amount;
	}

}