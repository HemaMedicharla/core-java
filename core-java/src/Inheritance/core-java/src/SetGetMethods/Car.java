package SetGetMethods;

public class Car {
	
	int carId;
	String brand;
	String model;
	double rentalPricePerDay;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int id) {
		carId = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String b1) {
		brand = b1;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String a1) {
		model = a1;
	}
	public double getPrice() {
		return rentalPricePerDay;
	}
	public void setPrice(double p1) {
		rentalPricePerDay = p1;
	}
	public String getCarData() {
		return " Car Id:"+carId+"\n Car Brand:"+brand+"\n Car Model:"+model+"\n Car PricePerDay:"+rentalPricePerDay;
	}
	

}


