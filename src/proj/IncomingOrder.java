package proj;

public class IncomingOrder extends Order
{
	private Supplier supplier;
	
	public IncomingOrder() {
		super();
		supplier = null;	
	}
	

	public IncomingOrder(Supplier supplier) {
		super();
		this.supplier = supplier;
	}




	@Override
	public void printInfo() {
		System.out.println("INCOMING");
		super.printInfo();
		System.out.println("Supplier: " + supplier.getSupplierName());
		
	}

}