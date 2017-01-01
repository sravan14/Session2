
public class PrintX {

	public static void main(String[] args) {
		printX();

	}
	public static void printX(){
		for(int row=0;row<5;row++)
		{
			for(int col=0;col<5;col++)
			{
				if(row==col || row+col==4)
				{
					System.out.print("x");
				
				}
				else
				{
					System.out.print("_");				
				}
					
				
			}
			System.out.println("");
			}
		
	}

}
