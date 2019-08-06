class test1{
    int a,b;
    test1()
    {
        System.out.println("No Parameters");
        a=10;
        b=20;
        System.out.println(a+","+b);
    }
    test1(int x)
    {
        System.out.println("One Parameter");
        a=x;
        b=x;
        System.out.println(a+","+b);
    }
    test1(int x,int y)
    {
        System.out.println("Two Parameters");
        a=x;
        b=y;
        System.out.println(a+","+b);
    }
}
public class PassingObject2 {
    public static void main(String[] args)
    {
        test1 obj1=new test1();
        test1 obj2=new test1(100);
        test1 obj3=new test1(25,50);

    }
}
