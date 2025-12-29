
public class SimpleInterestCalculator {
	public static double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}

	public static void main(String[] args) {
		
		System.out.println(calculateSimpleInterest(5000,4,2));

	}

}
