package dharani.peopletech;

public class WrapperArray {

	public static void main(String[] args) {
Integer ids[]=new Integer[10];
ids[0]=12;
//int x=ids[0];//implicitly Unboxing from Wrapper-->Primitive Value taking place
byte b=ids[0].byteValue();
System.out.println("byte 12 is : "+b);
System.out.println("arg[0]="+(Integer.parseInt(args[0])+5));
	}

}
