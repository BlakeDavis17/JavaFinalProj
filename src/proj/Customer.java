package proj;

import java.util.*;
import java.util.Scanner;

public class Customer {
	private String customerName;
	private String location;
	private boolean isReturning;
	private static HashSet<Customer> customerList = new HashSet<>();


	//Constructors
	public Customer() {
		this.customerName = "NONE";
		this.location = "NONE";
		this.isReturning = false;
	}




	public Customer(String customerName, String location, boolean isReturning) {
		this.customerName = customerName;
		this.location = location;
		this.isReturning = isReturning;
	}
	//Methods

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public boolean isReturning() {
		for(Customer customerName:customerList)
		{
			if(customerList.contains(customerName)) {boolean isReturning = true;}
		}
		return isReturning;
	}


	public void setCustomerInfo(Scanner scnr)
	{
		System.out.println("Enter your company's name");
		this.customerName = scnr.nextLine();
		System.out.println("Enter your company's location");
		this.location = scnr.nextLine();
		this.isReturning = this.isReturning();
		//customerList.add(this.Customer);
	}




}
