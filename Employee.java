package SetGetMethods;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	public int getId() {
		return employeeId;
	}
	public void setId(int id) {
		employeeId = id;
	}
	public String getName() {
		return employeeName;
	}
	public void setName(String name) {
		employeeName = name;
	}
	public double getSalary() {
		return employeeSalary;
	}
	public void setSalary(double salary) {
		employeeSalary = salary;
	}
	
	public String getEmployeeData() {
		return " Employee Id:"+employeeId+"\n Employee Name:"+employeeName+"\n Employee Salary:"+employeeSalary;
	}

}
