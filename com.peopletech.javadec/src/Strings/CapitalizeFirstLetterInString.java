//8.Convert the word from small letter to capital letter word in  given  String ?
//String s =”b.v.raju college” //convert raju  into capital.
package Strings;

import java.util.*;
import java.lang.*;

public class CapitalizeFirstLetterInString {
	public static void main(String[] args) {

		String name = "b.v.raju college";
		System.out.println("Original String: " + name);
		String firstLetStr = name.substring(4, 8);
		String remLetStr = name.substring(0, 4);
		String remLetStr1 = name.substring(8, 16);
		firstLetStr = firstLetStr.toUpperCase();
		String firstLetterCapitalizedName = firstLetStr;
		System.out.println("String with first letter as Capital: " + remLetStr + firstLetterCapitalizedName + remLetStr1);

	}
}
