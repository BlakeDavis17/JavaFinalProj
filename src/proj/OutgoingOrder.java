package proj;

public class OutgoingOrder extends Order
{
	private Customer customer;

	public OutgoingOrder(Customer customer, Product product, int quantity, boolean isShippingPriority) {
		super(product, quantity, isShippingPriority);
		this.customer = customer;
	}
	
	@Override
	public void printInfo() {
		System.out.println("OUTGOING");
		System.out.println("Customer: " + customer.getCustomerName());
		super.printInfo();
		
	}
	
}
