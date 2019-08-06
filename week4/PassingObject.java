class test
{
    int a;
    test()
    {
        a=10;
        System.out.println(a);
    }
    void display(test ob)
    {
        System.out.println("Initialize:"+ob.a);
        a=ob.a;
        System.out.println("(Value: "+a);
    }
}
class PassingObject
{
    public static void main(String[] args)
    {
        test ob=new test();     //automatically calls constructor
        test ob2=new test();    //automatically calls constructor
        ob2.display(ob);
        ob.a=50;
        ob2.display(ob);
    }
}