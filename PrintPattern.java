
public class PrintPattern {
	public static void main(String[] args) {
		printXPattern();

	}	


public static void printXPattern(){
	for(int row=0;row<5;row++)
	{
		for(int col=0;col<5;col++)
		{
			if(row==2)
			{			
				switch (col) {
				case 0:
					System.out.print("a");
					break;
				case 1:
					System.out.print("b");
					break;
				case 2:
					System.out.print("c");
					break;
				case 3:
					System.out.print("b");
					break;
				case 4:
					System.out.print("a");
					break;
				
				}
			}
			else if(row==1 || row==3)
			{
				switch (col) {
				case 1:
					System.out.print("a");
					break;
				case 2:
					System.out.print("b");
					break;
				case 3:
					System.out.print("a");
					break;
				default: 
					System.out.print(" ");
				}
				
				
				
			}
			else if(row==0 || row==4)
			{
				if(col==2)
				{
					System.out.print("a");
				}
				else
				{
				 
					System.out.print(" ");
				}
			}
			else {
				System.out.print(" ");
				
			}
			}
				
		System.out.println("");
		}
		
		}
	
}




