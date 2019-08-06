
import java.util.*;
class SingleCharInput
{
 public static void main(String[] args)
 {
     char a;
     System.out.println("Enter a string (or) a single character:");
     Scanner ob=new Scanner(System.in);
     a=ob.next().charAt(0);
     System.out.println(a);
 }
}
