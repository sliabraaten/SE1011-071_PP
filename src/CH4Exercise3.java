
public class CH4Exercise3 {

	public static void main(String[] args) 
	{
		int count = 0;
		int sum = 0;
		int product = 1;
		 do 
		 {
			 count++;
			 sum += count;
			 product *= count;
			 if (count == 5)
			 {
				 System.out.println("Sum = " + sum);
			 	 System.out.println("Product = " + product);
			 }
		 }while (count < 5);
	}

}
