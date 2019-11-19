package proj;

public class TestES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Supplier ATNT = new Supplier();
		Product trey = new Product();
		
		Order dicks = new Order(trey, 5, false);
		Order balls = new Order();
		IncomingOrder customerOrder = new IncomingOrder();

		
		balls.printInfo();
		
		for(Order x : Order.orderList) {
			System.out.println(x);
		}
		
		customerOrder.printInfo();
	}

}
