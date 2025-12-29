//17. Currency Converter:- Convert INR → USD using a rate variable.

package Variables;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inr = 1000;
		double rate = 83.0;   // 1 USD = 83 INR
		double usd = inr / rate;
		System.out.println(usd);

	}

}
