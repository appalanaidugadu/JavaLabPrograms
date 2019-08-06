public class Palindrome 
{
    public static void main(String[] args)
{
    int a=1001,b,sum=0,rev=0;
    rev=a;
    while(a!=0)
    {
    b=a%10;
    sum=sum*10+b;
    a=a/10;
    
    }
    if(sum==rev)
    {
        System.out.println("Given number is palindrome");
        
    }
    else
    {
        System.out.println("Given numbber is not palindrome");
    }

   System.out.println("reverse num is:"+sum);
}
}

   
