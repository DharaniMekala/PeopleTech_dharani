package dharani.peopletech;
public class Pizza {
private PizzaStatus status=PizzaStatus.READY;
public enum PizzaStatus
{
	//METHOD,FIELD,CONSTRUCTORS
	//In java Naming convention says declare any constant with all char in Upper case.
	ORDERED,//15
	PREPARING,//10
	READY,//2
	DELIVERED;//0
}
public boolean isDeliverable()
{
	if(getStatus()==PizzaStatus.READY)
	//if(getStatu().equals(PizzaStatus.READY)	
		return true;
	else
		return false;
}
public int getDeliveryTimeInMin()
{
	int r=0;
	switch(status)
	{
	case ORDERED:r=15;break;
	case PREPARING:r=10;break;
	case READY:r=2;break;
	case DELIVERED:r=0;break;
	default:
		System.out.println("Pizza is not yet Ordered");
	}
	return r;
}
public PizzaStatus getStatus()
{
	return status;
}
public void setStatus(PizzaStatus status)
{
	this.status=status;
}
}

