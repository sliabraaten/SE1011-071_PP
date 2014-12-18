import java.util.Scanner;

//CH4EX5
public class Town 
{
	private int numberOfAdults,numberOfChildren; 
	public Town (int numberOfAdults, int numberOfChildren)
	{
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
	}
	
	public Town ()
	{
		this.numberOfAdults = 0;
		this.numberOfChildren = 0;
	}
	
	public void simulateBirth ()
	{
		//adds one child to the town
		numberOfChildren++;
	}
	
	public void simulateBirth (int births)
	{		
		//adds a specific number of children the town
		numberOfChildren += births;
	}
	
	public void intitalizeTown()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number of childern");
		numberOfChildren = input.nextInt();
		System.out.print("enter the number of adults");
		numberOfAdults = input.nextInt();
	}
	
	public void printStatistics()
	{
		System.out.println("the number of adults: " + numberOfAdults);
		System.out.println("the number of children: " + numberOfChildren);
	}
}
