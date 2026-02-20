package Instance1;

public class Car {
	public String  carMake;
	public String carModel;
	public int  manufacturingYear;
	public void addCarDetails(String  Make,String Model,int  Year) {
		carMake=Make;
		carModel=Model;
		manufacturingYear=Year;
		
	}
	public String displayDetails() {
		return "CarMake :"+carMake+", CarModel"+carModel+", manufacturingYear :"+manufacturingYear;
		
	}

	public static void main(String[] args) {
		Car c1=new Car();
		c1.addCarDetails("Lamborghini","Huracan Tecnica", 2022);
		System.out.println(c1.displayDetails());
		

	}

}
