package proj;

public class TestES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod1 = new Product("Phone", 7.0);
        Supplier ATNT = new Supplier("At&t");
		Customer cust1 = new Customer("David", "Atlanta", false);
		
		//Order dicks = new Order(prod1, 5, false);
		//Order balls = new Order();
		IncomingOrder supplierOrder = new IncomingOrder(ATNT, prod1, 6, true);
        OutgoingOrder customerOrder = new OutgoingOrder(cust1, prod1, 5, false);
		
		//balls.printInfo();
		Order.printOrderHistory();
		
		//customerOrder.printInfo();
	}

}
