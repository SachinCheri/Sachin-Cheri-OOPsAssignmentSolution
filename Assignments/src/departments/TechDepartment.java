package departments;

public class TechDepartment extends SuperDepartment {
	//extended from SuperDepartment since it is the super class as described
	public TechDepartment() {
		super();
		
	}	
	public String departmentName() {
		return "Tech Department";
		
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getStackInformation() {
		return "Core JAVA";
	}
	
}