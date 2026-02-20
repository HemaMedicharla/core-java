package test;


import java.util.Scanner;

class Vehicle{
	private String OwnerName;
	private String VehicleNumber;
	private String VehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
	
		this.OwnerName = ownerName;
		this.VehicleNumber = vehicleNumber;
		this.VehicleType = vehicleType;
	}
	public void Profile() {
		System.out.println("OwnerName :"+OwnerName);
		System.out.println("VehicleNumber :"+VehicleNumber);
		System.out.println("VehicleType :"+VehicleType);
	}
}
class ServiceVehicle extends Vehicle{
	private String ServiceCenterName;
	private String ServiceCategory;
	public ServiceVehicle(String serviceCenterName, String serviceCategory,String ownerName,String vehicleNumber,String vehicleType) {
		super(ownerName,vehicleNumber,vehicleType);
		ServiceCenterName = serviceCenterName;
		ServiceCategory = serviceCategory;
		System.out.println("Vehicle Profile Has Been Created");
	}
	public void UpdateServiceCategory(String newCategory) {
		if(newCategory==null || newCategory.equals("")) {
			System.out.println("Enter a valid details");
		}else {
			ServiceCategory=newCategory;
		}
	}
	public void UpdateServiceCenterName(String newCenterName) {
		if(newCenterName==null || newCenterName.equals("")) {
			System.out.println("Enter a valid details");
		}else {
			ServiceCenterName=newCenterName;
		}
	}
	public void VehicleProfileDetails() {
		Profile();
		System.out.println("service center name :"+ServiceCenterName);
		System.out.println("service category :"+ServiceCategory);
	}
	
}

public class VehicleManagementSyatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String ownerName=sc.nextLine();
		System.out.println("Enter Vehicle Number :");
		String vehicleNumber=sc.nextLine();
		System.out.println("Enter Vehicle Type :");
		String vehicleType=sc.nextLine();
		System.out.println("Enter Service Center Name :");
		String serviceCenterName=sc.nextLine();
		System.out.println("Enter Service Category :");
		String serviceCategory=sc.nextLine();
		ServiceVehicle sv=new ServiceVehicle(serviceCenterName, serviceCategory, ownerName, vehicleNumber, vehicleType);
		int choice=0;
		boolean status=true;
		while(status) {
		System.out.println("--- Menu ---\r\n" + 
				"1. Update Service Category\r\n" + 
				"2. Update Service Center Name\r\n" + 
				"3. View Vehicle Profile Details\r\n" + 
				"4. Exit\r\n" + 
				"");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:{
			System.out.println("Update Service Category");
			String catego=sc.nextLine();
			sv.UpdateServiceCategory(catego);
			break;
		}
		case 2:{
			System.out.println("Update Service Center");
			String Center=sc.nextLine();
			sv.UpdateServiceCenterName(Center);
			break;
		}
		case 3:{
			System.out.println("View Profile");
			sv.VehicleProfileDetails();
			break;
		}
		case 4:{
			System.out.println("Thank You !");
			status=false;
			break;
		}
		default:{
			System.out.println("Invalid Details");
		}
		}
		}
		sc.close();

	}

}
