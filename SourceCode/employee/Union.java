package employee;
import java.util.*;

public class Union{
	public static ArrayList<Employee> unionMembers = new ArrayList<>();
	String unionName;
	int postDay=0;

	Union(){
		unionName = "FK-Employee-Union";
	}

	public void addMember(Employee emp){
		// TODO Check if already present
		if(unionMembers.contains(emp) == true){
			return;
		}
		emp.myUnionRecord = new UnionRecords();
		unionMembers.add(emp);
	}
	public void postWeeklyDues(){
		for(Employee emp:unionMembers){
			emp.myUnionRecord.postWeeklyCharge();
		}
	}
	public void postServiceCharge(double amount,Employee ... emp){
		for(Employee e:emp){
			e.myUnionRecord.postServiceCharge(amount);
		}
	}
	
	public void postServiceCharge(double amount,ArrayList<Employee> emp){
		for(Employee e:emp){
			e.myUnionRecord.postServiceCharge(amount);
		}
	}


	public String toString(){
		return unionName + ": " + unionMembers.size();
	}
}
