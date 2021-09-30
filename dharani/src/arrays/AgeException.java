package arrays;

public class AgeException extends Exception {
int age;
String name;
public AgeException(int age, String name)
{
	this.age=age;
	this.name=name;
}
public String toString()
{
return (age +" your age is not elgible for bank account");
}
}