package arrays;

public class CricketWholeSale {

	public void placeOrder(int qty) throws OrderException {
		if (qty < 5)
			throw new OrderException(qty);
		else
			System.out.println("Your Order placed Successfully");
	}

	public static void main(String[] args) {
		CricketWholeSale sale = new CricketWholeSale();
		try {
			sale.placeOrder(20);
			sale.placeOrder(4);
		} catch (OrderException e) {
			System.out.println(e);
		}
	}

}
