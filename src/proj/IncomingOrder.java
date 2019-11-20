package proj;

public class IncomingOrder extends Order
{
	private Supplier supplier;
	
	public IncomingOrder() {
		super();
		supplier = null;	
	}
	

	public IncomingOrder(Supplier supplier, Product product, int quantity, boolean isShippingPriority) {
		super(product, quantity, isShippingPriority);
		this.supplier = supplier;
	}




	@Override
	public void printInfo() {
		System.out.println("INCOMING");
		System.out.println("Supplier: " + supplier.getSupplierName());
		super.printInfo();
		
		
	}

}