package departments;

public class HrDepartment extends SuperDepartment {
	 //extended from SuperDepartment since it is the super class as described
	public HrDepartment() {
		super();
		
	}	
	public String departmentName() {
		return "HR Department";
		
	}
	
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String DoActivity() {
		return "Team Lunch";
	}
	
}

