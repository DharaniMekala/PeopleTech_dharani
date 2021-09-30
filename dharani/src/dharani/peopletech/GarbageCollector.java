package dharani.peopletech;

public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();
System.out.println("G1 : "+g1);
System.out.println("G2 : "+g2);
g1=null;
//requesting JVM for running GarbageCollector
System.gc();
//g2=null;
Runtime.getRuntime().gc();
	}
protected void finalize() throws Throwable
{
	System.out.println("Garbage Collector called....");
	System.out.println("Object garbage collected :"+this);
}
}
