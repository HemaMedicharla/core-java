//inheritance

package ProblemSolving;
class Employee{
	double salary=50000;
}

public class Manager extends Employee {
	double bonus=20000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
	    double total = m.salary + m.bonus;
		System.out.println("Total Salary :"+total);

	}

}
