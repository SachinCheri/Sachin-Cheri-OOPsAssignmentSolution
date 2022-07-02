package departments;

public class AdminDepartment extends SuperDepartment {
	//extended from SuperDepartment since it is the super class as described

	public AdminDepartment() {
		super();
		
	}	
	public String departmentName() {
		return "Admin Department";
		
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}