//Exercise 4: Create a method to check if a number is a power of two or not 9
    package ExerciseLab1;
    import java.util.Scanner;
    public class checkNumber {
	public static void main(String[] args) { 
	System.out.println("Enter the number: "); 
	Scanner scan = new Scanner(System.in); 
	int n = scan.nextInt(); 
	System.out.println(checkNumber(n)); 
	} 
	private static boolean checkNumber(int n) { 
	while(n != 1) { 
	if (n % 2 != 0) { 
	return false; 
	} 
	n = n/2; 
	} 
	return true; 
	} 
	} 

