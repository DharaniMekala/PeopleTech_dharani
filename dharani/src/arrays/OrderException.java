package arrays;

public class OrderException extends Exception {
	int qty;

	public OrderException(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Your requested quantity is :" + qty
				+ " To place a wholesale order for Cricket kits,Minimum quantity is 5 kits atleast.";
	}
}
