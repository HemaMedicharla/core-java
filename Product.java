package SetGetMethods;

public class Product {
	int productId;
	String productName;
	double Price;
	int Quantity;
	public int getID() {
		return productId;
	}
	public void setID(int id) {
		productId = id;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		productName = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getProductData() {
		return " Product Id :"+productId+"\n Product Name :"+productName+"\n Product Price :"+Price+"\n Product Quantity :"+Quantity;
		
	}

	

}
