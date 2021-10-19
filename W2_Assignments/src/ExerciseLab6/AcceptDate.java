//Exercise 6: Create a method to accept date and print the duration in days, months and years with regards to current system date. 
package ExerciseLab6;

import java.time.*;
import java.util.*;

public class AcceptDate {
	public static void main(String[] args) {
		LocalDate Date = LocalDate.of(1999, 9, 25);
		System.out.println("Old date :" + Date);
		LocalDate now = LocalDate.now();
		System.out.println("Current Date :" + now);
		Period different = Period.between(Date, now);
		System.out.println("Printing the difference is :" + different);
		// System.out.printf("\nDifference is %d years, %d months and %d days \n\n",
		// different.getYears(), different.getMonths(), different.getDays());

	}

}