package SetGetMethods;

public class Example1 {
	 int age;
	 byte b1;
	 short s1;
	 long l1;
	 float f1;
	 double d1;
	 boolean b2;
	 char ch;
	
	public int getAge() {
		return age;
	}
	public void setAge(int stage) {
		age=stage;
		
	}//int
	
	public byte getByte() {
		return b1;
	}
	public void setByte(byte i) {
		b1=i;
		
	}//byte
	
	public short gets1() {
		return s1;
	}
	public void sets1(short s) {
		s1=s;
		
	}//short
	
	public long getl1() {
		return l1;
	}
	public void setl1(long l) {
		l1=l;
		
	}//long
	
	public float getf1() {
		return f1;
	}
	public void setf1(float f) {
		f1=f;
		
	}//float
	
	public double getd1() {
		return d1;
	}
	public void setd1(double d) {
		d1=d;
		
	}//double
	
	public boolean getb2() {
		return b2;
	}
	public void setb2(boolean bl) {
		b2=bl;
		
	}//boolean
	public char getch() {
		return ch;
	}
	public void setch(char ch1) {
		ch=ch1;
		
	}//char

	public static void main(String[] args) {
		
		Example1 obj=new Example1();
		obj.setAge(21);
		System.out.println(obj.getAge());//int
		System.out.println("-------------");
		byte i=10;//typechasting
		obj.setByte(i);
		System.out.println(obj.getByte());//byte
		System.out.println("-------------");
		short s=15;
		obj.sets1(s);
		System.out.println(obj.gets1());//short
		System.out.println("-------------");
		obj.setl1(20000);
		System.out.println(obj.getl1());//long
		System.out.println("-------------");
		obj.setf1(200.5f);
		System.out.println(obj.getf1());//float
		System.out.println("-------------");
		obj.setd1(400.6D);
		System.out.println(obj.getd1());//double
		System.out.println("-------------");
		obj.setb2(true);
		System.out.println(obj.getb2());//boolean
		System.out.println("-------------");
		obj.setch('z');
		System.out.println(obj.getch());//char

	}

}
