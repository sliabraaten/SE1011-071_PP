import java.util.Scanner;


//CH6Ex12
public class StudentIdDriver 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		StudentId student;
		String name;
		
		student = new StudentId();
		
		System.out.println("Enter student name:");
		name = stdIn.next();
		student.setName(name);
		
		System.out.println("Enter student id: ");
		int id = stdIn.nextInt();
		student.setId(id);
		
		while (!student.isValid())
		{
			System.out.println("Invalid student id - reenter: ");
			id = stdIn.nextInt();
			student.setId(id);
					
		}
		System.out.println("\n" + name + ", your new email account is: \n" + student.getEmailAccount());

	}

}
