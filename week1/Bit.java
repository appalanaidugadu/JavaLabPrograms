import java.util.Scanner;
public class Bit
{
	public static void main(String[] args)
	{
		System.out.println("enter the values of a and b");
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a+" is the value of a");
		System.out.println(b+" is the value of b");
		System.out.println("Bit wise 1.AND 2.OR 3.Exclusive OR 4.Shift left 5.shift right 6.one's compliment");
		System.out.println("Select your choice");
		int c = input.nextInt();
		switch(c)
		{
			case 1:
				System.out.println((a & b)+" is the bit wise AND");
				break;
			case 2:
				System.out.println((a | b)+" is the bit wise OR");
				break;
			case 3:
				System.out.println((a ^ b)+ " is the bit wise EXCLUSIVE OR");
				break;
			case 4:
					a= a >> 1;
				System.out.println(a+ " is the RIGHT SHIFT of a");
				break;
			case 5:
					b= b << 1;
					System.out.println(b +" is the LEFT SHIFT of b");
					break;
			case 6:
					System.out.println("enter a value");
					int d = input.nextInt();
					d = ~d;
					System.out.println(d+" is the COMPLEMENT of the d");
					break;
			default:
					System.out.println("plz select the currect one u idiot!!!");
				
		}
	}
}
