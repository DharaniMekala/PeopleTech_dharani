package extraprograms;

public class revString {
public static void main(String[] args) {
	/*
	 * String s1="dharani"; String s2=""; for(int i=s1.length()-1;i>=0;i--) {
	 * s2=s2+s1.charAt(i);
	 * 
	 * } System.out.println(s2);
	 */
	int a[]= {1,2,3,4};
	for(int i=a.length-1;i>=0;i--)
	{ 
		System.out.print(a[i]);
	}
}

}