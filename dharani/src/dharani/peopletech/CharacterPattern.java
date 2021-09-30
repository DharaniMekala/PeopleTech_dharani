package dharani.peopletech;

public class CharacterPattern {
public static void charPyramid(int n) {
	char alphabet='A';
	for(int i=0;i<n;i++)
	{
		for(int s=n-1;s>1;s--)
		System.out.print(" ");
		for(int j=0;j<=i;j++)
			System.out.print(alphabet+" ");
	++alphabet;
	System.out.println("");
	}
}
	public static void main(String[] args) {
	charPyramid(10);
	}

}
