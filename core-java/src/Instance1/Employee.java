package Instance1;

public class Employee {
	public  String employeeName;
	public  int employeeId;
	public  double employeeSalary;
	public void addEmployeeDetails(String name,int id,double salary) {
		 employeeName=name;
		 employeeId=id;
		 employeeSalary=salary;
		
	}
	public String displayDetails() {
		return "EmployeeName:" +employeeName+", EmployeeId:"+employeeId+"EmployeeSalary :"+employeeSalary;
//		System.out.println("employeeName :"+employeeName);
//		System.out.println("employeeId :"+employeeId);
//		System.out.println("employeeSalary :"+employeeSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.addEmployeeDetails("Hema",51,80000);
		System.out.println(emp.displayDetails());
		


	}
	

}
