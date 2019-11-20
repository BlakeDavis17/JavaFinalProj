package proj;

import java.util.*;
import java.util.Scanner;

public class Order 
{
	protected int quantity;
	protected boolean isShippingPriority;
	protected Product product = new Product();
	protected static ArrayList<Order> orderList = new ArrayList<Order>();


	//constructors
	public Order()
	{
		this.product = null;
		this.quantity = -1;
		this.isShippingPriority = false;
		orderList.add(this);
	}

	public Order(Product product, int quantity, boolean isShippingPriority)
	{
		this.product = product;
		this.quantity = quantity;
		this.isShippingPriority = isShippingPriority;
		orderList.add(this);
	}


	public void placeOrder(Scanner scnr)
	{
		this.quantity = scnr.nextInt();
	}
	
	public void printInfo() {
	    if (product == null) {
	    	System.out.println("Product must be defined");
	    }
	    
	    else {
		System.out.println("Product: " + product.getProductName());
		System.out.println("Quantity: " + quantity);
		System.out.println("Total cost: $" + (product.getPrice() * quantity));
		System.out.println("Shipping Priority: " + isShippingPriority);
	    }
		
	}
	
	public static void printOrderHistory() {
		for(Order x : Order.orderList) {
			x.printInfo();
			System.out.println("-----------------");
		}
	}
	

}
