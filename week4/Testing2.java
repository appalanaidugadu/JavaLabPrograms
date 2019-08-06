class Test2
{
    int a;
    Test2()
    {
        a=10;
        System.out.println(a);
    }
    int display()
    {   a=50;
        return a;
    }
    void print(int x)
    {
        a=x;
        System.out.println("Initialize "+a);
    }
    int show(int x)
    {
        a=x;
        return a;
    }
}
public class Testing2 
    {
    public static void main(String[] args)
    {
        Test2 obj=new Test2();
        int c=obj.display();
        System.out.println(c);
        obj.print(20);
        int d=obj.show(30);
        System.out.println("return "+d);
    }
}
