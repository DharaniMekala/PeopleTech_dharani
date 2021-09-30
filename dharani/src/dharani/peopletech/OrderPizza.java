package dharani.peopletech;

public class OrderPizza {

	public static void main(String[] args) {
	Pizza peppyPaneer=new Pizza();
	peppyPaneer.setStatus(Pizza.PizzaStatus.PREPARING);
System.out.println("Your Order may take Maximum : "+peppyPaneer.getDeliveryTimeInMin());
	}

}
