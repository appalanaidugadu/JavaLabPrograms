import java.util.Scanner;

public class input
{
    public static void main(String[] args)
{
            int a;
            float b;
            char c;
            double d;
            String e;
            System.out.println("Enter Int:");
            Scanner obj=new Scanner(System.in);
            a = obj.nextInt();
            System.out.println("Entered no is "+a);
             System.out.println("Enter Float:");
            Scanner obj1=new Scanner(System.in);
            b = obj1.nextFloat();
            System.out.println("Entered no is "+b);           
            System.out.println("Enter Character:");
            Scanner obj3=new Scanner(System.in);
            c= obj3.  next().charAt(0);
            System.out.println("Entered no is "+c);
            System.out.println("Enter Double:");
            Scanner obj2=new Scanner(System.in);
            d= obj2.nextDouble();
            System.out.println("Entered no is "+d);        
            System.out.println("Enter String:");
            Scanner obj4=new Scanner(System.in);
            e= obj4.nextLine();
            System.out.println("Entered no is "+e);     
         }
}