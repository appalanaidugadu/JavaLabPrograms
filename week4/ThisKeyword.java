class temp
{
    int a;
    temp()
    {
        this(5);
        System.out.println("Hii");
    }
    temp(int x)
    {
        a=x;
        System.out.println(a);
    }
}
    
public class ThisKeyword {
    public static void main(String[] args)
    {
            temp ob=new temp();
    }
}
