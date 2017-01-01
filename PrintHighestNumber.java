
public class PrintHighestNumber {
	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c= 13;
		printHighestNumber(a,b,c);

	}
	public static void printHighestNumber(int a, int b, int c){
		
		if(a>b && a>c)
			System.out.print(a);
		else if(b>a&&b>c)
			System.out.print(b);
		else if(c>a&&c>b)
			System.out.print(c);
		
	}
}
