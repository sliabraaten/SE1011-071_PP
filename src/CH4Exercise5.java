import java.util.Scanner;

public class CH4Exercise5 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int i, num, product;
		
		System.out.println("Enter a positive even number: ");
		num = stdIn.nextInt();
		
		product = 1;
		for(i = 2; i <= num; i+=2)
		{
			product *=i;
		}
		
		System.out.println("Product = " + product);
			
	}//end main
}//end class
