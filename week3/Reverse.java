public class Reverse
{
public static void main(String[] args)
{
    int a=523,b,sum=0;
    while(a!=0)
    {
    b=a%10;
    sum=sum*10+b;
    a=a/10;
    
    }
   System.out.println("reverse num is:"+sum);
}
}
