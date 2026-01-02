package Instance1;

public class Product {
	public String  productName ;
	public int  productId;
	public double productPrice;
	public void  addProductDetails(String name,int id,double price) {
		productName=name;
		productId=id;
		productPrice=price;
	}
	public String displayDetails(){
		return "ProductName:"+productName+",  ProductId :"+productId+",  productPrice :"+productPrice;
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.addProductDetails("NIVEA Soft Moisturizer",12234,500);
		System.out.println(p.displayDetails());
		// TODO Auto-generated method stub

	}

}
