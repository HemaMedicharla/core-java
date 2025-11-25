package SetGetMethods;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setId(34);
		obj.setName("Hema");
		obj.setSalary(80000.0);
		System.out.println(obj.getEmployeeData());
		System.out.println("-------------------");
		System.out.println("After Updating The Salary");
		obj.setSalary(10000000.0);
		System.out.println(obj.getEmployeeData());

	}

}
