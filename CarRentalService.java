package SetGetMethods;

public class CarRentalService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car();
		Car obj2=new Car();
		obj1.setCarId(2004);
		obj1.setBrand("Toyota");
		obj1.setModel("Toyota Fortuner");
		obj1.setPrice(3500000.0);
		System.out.println(obj1.getCarData());
		System.out.println(" ----------------------");
		obj2.setCarId(1997);
		obj2.setBrand("Hyundai");
		obj2.setModel("Hyundai Creta");
		obj2.setPrice(1200000.0);
		System.out.println(obj1.getCarData());

	}

}
