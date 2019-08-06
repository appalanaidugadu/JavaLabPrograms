import java.util.Scanner;
public class incndec	
{
	public static void main(String[] args)
	{
		System.out.println("enter a value:");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("enter ur choice buddy:");
		System.out.println("for increment press 1. for decrement press 2.");
		int choice=input.nextInt();
		switch(choice)
		{
			case 1:
				a=++a;
				System.out.println("a valuce successfully incremented "+a);
				break;
			case 2:
				a=--a;
				System.out.println("a valuce successfully decremented "+a);
				break;
			default:
				System.out.println("select currect option gootle..");
		}
	}
}
				
			
		