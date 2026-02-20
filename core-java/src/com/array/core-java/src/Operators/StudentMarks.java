package Operators;

public class StudentMarks {
	int m1;
	int m2;
	int m3;
	public static int total( int a,int b,int c) {
		return a+b+c;
		
	}
	public void isPassed() {
		int t=total(m1,m2,m3);
		t++;
		if(t>=120) {
			System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks obj=new StudentMarks();
		obj.m1=89;
		obj.m2=98;
		obj.m3=99;
		obj.isPassed();

	}

}
