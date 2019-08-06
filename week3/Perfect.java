public class Perfect 
{
    public static void main(String[] args)
    {
        int a=6,i,sum=0,b=0;
        b=a;
        for(i=1;i<a;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
                
        }
        if(sum==b)
        {
            System.out.println(a+" is perfect number");
        }
        else
        {
            System.out.println(a+" is not perfect number");
        }
    }
    
}
