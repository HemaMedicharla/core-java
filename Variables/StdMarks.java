//10. Student Marks:- Store 5 subject marks.- Calculate total, average, percentage.package Variables;
package Variables;
public class StdMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math=95;
		int pys=90;
		int tel=97;
		int eng=97;
		int soc=92;
		int total=math+pys+tel+eng+soc;
		int avg=total/5;
		int percentage=(total/500)*100;
		System.out.println("Student Total Marks :"+total);
		System.out.println("Student Average :"+avg);
		System.out.println("Student Percentage :"+percentage);

	}

}
