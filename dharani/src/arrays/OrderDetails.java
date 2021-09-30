package arrays;
import java.util.Date;
public class OrderDetails {

	public static void main(String[] args) {
		Order orders[]=new Order[5];
		orders[0]=new Order(12,45,new Date(),456.87);
		orders[1]=new Order(73,47,new Date(),146.87);
		orders[2]=new Order(82,38,new Date(),423.87);
		orders[3]=new Order(59,95,new Date(),221.87);
		orders[4]=new Order(39,56,new Date(),123.87);
	for(Order o:orders)
		System.out.println(o);
//searching	without algorithm may hit the performance of my application
	//search for order having order value higher than 400 rs.
	}

}
