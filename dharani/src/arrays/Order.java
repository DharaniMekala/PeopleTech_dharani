package arrays;

import java.util.Date;

public class Order {
int number;
int shipmentNumber;
Date orderDate;
double orderTotal;
public Order(int number, int shipmentNumber, Date orderDate, double orderTotal) {
	super();
	this.number = number;
	this.shipmentNumber = shipmentNumber;
	this.orderDate = orderDate;
	this.orderTotal = orderTotal;
}
@Override
public String toString() {
	return "Order [number=" + number + ", shipmentNumber=" + shipmentNumber + ", orderDate=" + orderDate
			+ ", orderTotal=" + orderTotal + "]";
}

}
