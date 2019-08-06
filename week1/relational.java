import java.util.Scanner;
public class relational
{
	public static void main(String[] args)
	{
		boolean c;
		System.out.println("enter the values of a and b");
		Scanner input=new Scanner(System.in);
		int a =input.nextInt();
		int b =input.nextInt();
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		if (a<b)
		{
			System.out.println(a+" is leass than "+b);
		}
		else if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(a==b)
		{
			System.out.println(a+" and "+b+" are equal");
		}
	}
}