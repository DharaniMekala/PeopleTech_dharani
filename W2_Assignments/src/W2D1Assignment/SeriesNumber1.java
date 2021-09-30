package W2D1Assignment;

public class SeriesNumber1 {
public static void main(String[] args) {
	int a=1;
	int count=0;
	for(int i=1;i<=10;i++) {
		System.out.print(a+" ");
		if(i%2!=0)
			count+=8;
		int c=a+count;
		a=c;
}
}
}
