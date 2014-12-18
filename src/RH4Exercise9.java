import java.util.Scanner;

public class RH4Exercise9 
{
	public static void main(String [] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int score;
		int totalScore = 0;
		int count = 0;
		double average;
		boolean more = true;
		
		while (more)
		{
			System.out.println("Enter score (-1 to quit): ");
			score = stdIn.nextInt();
			if (score < 0)
				more = false;
			else
			{
				totalScore += score;
				count++;
			}
			
		}
		

	}
}
