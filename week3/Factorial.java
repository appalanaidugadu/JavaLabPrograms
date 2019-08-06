public class Factorial 
{
 public static void main(String[] args)
 {
     int a=5,fac=1,i;
     if(a==0)
     {
         System.out.println("Factorial of given number is:"+1);
     }
     else
     {
      for(i=1;i<=a;i++)
      {
          fac=fac*i;
      }
     }
     System.out.println("Factorial of given number is:"+fac);
     
 }
}
