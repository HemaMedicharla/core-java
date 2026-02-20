package Inheritance;

import java.util.Scanner;

class Vehicle{
	private String OwnerName;
	private long VehicleNumber;
	private String VehicleType;
}

public class ServiceVehicle extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String OwnerName=sc.nextLine();
		System.out.println("Enter Owner Name :"+OwnerName);
		long VehicleNumber=sc.nextLong();
		System.out.println("Enter Vehicle Number:"+VehicleNumber);
		String VehicleType=sc.nextLine();
		System.out.println("Enter Vehicle Typ0e:"+VehicleType);
		
		
		ServiceVehicle s=new ServiceVehicle();
		String ServiceCenterName;
		String Category;
		System.out.println("Vehicle Profile Has Been Created !");
		System.out.println("-----------menu------------");
		System.out.println("Update Service Category\r\n" + 
				"Update Service Center Name\r\n" + 
				"View Vehicle Profile Details\r\n" + 
				"Exit the program\r\n" + 
				"");
			
	}

}
