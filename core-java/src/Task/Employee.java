package Task;

public class Employee {
	int empId;
	String empName;
	int[] monthlySalaries;

	public Employee(int empId, String empName, int[] monthlySalaries) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.monthlySalaries = monthlySalaries;
	}
	public double calculateAnnualSalary() {
		int total=0;
		for(int ele:monthlySalaries) {
			total +=ele;
		}
		return total;
		}
		
	public void displayEmployeeDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(monthlySalaries);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"hema",new int[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,110000,6200000,530000});
		Employee emp2=new Employee(2,"hema",new int[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,510000,3200000,530000});
		Employee emp3=new Employee(1,"hema",new int[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,610000,2200000,430000});
		Employee[] emp= {emp1,emp2,emp3};
		for(Employee epp: emp) {
			epp.displayEmployeeDetails();
		}
		

	}

}
