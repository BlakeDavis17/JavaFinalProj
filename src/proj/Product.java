package proj;

public class Product 
{
	private String productName;
	private double price;
	//private int minInStock;	


	public Product()
	{
		this.productName = "NO NAME";
		this.price = -1;
	}

	public Product(String productName, double price)
	{
		this.productName = productName;
		this.price = price;
	}

	
	
	
	
	//Getters and Setters
	//---------------------------
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	


}

