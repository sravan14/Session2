import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number to swap");
		Scanner scan=new Scanner(System.in);
		int a =scan.nextInt();
		System.out.println("Please enter number to swap with");
		int b =scan.nextInt();
		scan.close();
		swapNumber(a, b);
	}
	public static void swapNumber(int a,int b){
	/*	a=(a+b);
		b=a-b;
		a=a-b;*/		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("FirstNumber is" +a);
		System.out.println("Second Number is" +b);
		
		
	}

}
