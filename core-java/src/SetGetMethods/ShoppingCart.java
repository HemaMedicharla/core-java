package SetGetMethods;

public class ShoppingCart {
	
	public static void main (String []args) {
		Product obj1=new Product();
		Product obj2=new Product();
		obj1.setID(21);
		obj1.setName("laptop");
		obj1.setPrice(80000.0);
		obj1.setQuantity(3);
		obj1.setQuantity(2);
		System.out.println(obj1.getProductData());
		System.out.println("-----------------------------");
		obj2.setID(22);
		obj2.setName("Mobile");
		obj2.setPrice(10000000.0);
		obj2.setQuantity(1);
		System.out.println(obj1.getProductData());
		
	}

}
