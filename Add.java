import java.util.Scanner;

public class Add {
	
	public static void main(String[] args){
		
		System.out.println("Please enter Integers to Add");
		 Scanner scanner = new Scanner(System.in);
		 int a=scanner.nextInt();
		 System.out.println(a);
		 System.out.println("Please enter Integers to Add");
		 int b=scanner.nextInt();
		 System.out.println(b);
	int sum=	 add(a,b);
		System.out.println(sum);
		 
		
		 
	
	}
	 public static int add(int a,int b){
		 
		 int sum,carry;
		 if(b==0)
		 {
			 return a;
		 }
		 else
			 sum=a^b;
		 carry=(a&b)<<1;
		 return add(sum,carry);
		 
		 
	 }

}
