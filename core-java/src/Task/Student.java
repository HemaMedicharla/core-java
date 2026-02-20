package Task;

public class Student {
	 int rollNumber;
	 String name;
	int[] marks;
	

	public Student(int rollNumber, String name, int[] marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	public double calculateAverage() {
		 double sum = 0;
		 for(int ele:marks) {
			 sum+=ele;
		 }
	        return  sum / marks.length;
	    
	}
	public void displayDetails() {
		System.out.println("Studenr RollNumber is :"+rollNumber);
		System.out.println("Student Name is :"+name);
		System.out.println("Student Average Marks is:"+calculateAverage());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student(1,"hema",new int[] {95,90,89,92});
		Student std2=new Student(2,"madhu",new int[] {91,96,80,94});
		Student std3=new Student(3,"viju",new int[] {93,91,80,96});
		Student[]  std= {std1,std2,std3};
		for(Student stt: std) {
			stt.displayDetails();
		}
		

	}

}
