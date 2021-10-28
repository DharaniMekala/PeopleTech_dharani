//14.Find the factorial of a large number.
package Array2Oct;
 
//import java.math.BigInteger;
 
public class largeFactorial {
	/*
	 * public static void main(String[] args) { int number = 10; BigInteger fact =
	 * BigInteger.ONE; for(int i =1;i<=number;i++) { fact =
	 * fact.multiply(BigInteger.valueOf(i)); }
	 * System.out.println("The factorial of the number is: " + "\n"+fact); }
	 */
static int  factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
public static void main(String[] args) {
	System.out.println(factorial(10));
}
}