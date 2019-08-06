import java.util.Scanner;
class employeedetails
{
	void display(char a,int b,int c,char d)
	{
		System.out.println("Employee name is  ",+a);
		System.out.println("Employee name is  ",+b);
		System.out.println("Employee name is  ",+c);
		System.out.println("Employee name is  ",+d);


	}
}
class employee
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter employee name ");
		String a=nextLine();
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter employee salary  ");
		int b=nextInteger();
		Scaner ob2=new Scanner(System.in);
		Sysetm.out.println("etner employee id ");
		int c=nextInteger();
		Scanner ob3=new Scanner(System.in);
		String d=nextLine();
		ob.display(a);
		ob1.display(b);
		ob2.display(c);
		ob3.display(d);
	}
}
		