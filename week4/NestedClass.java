class outer
{
    int a;
    void display()
    {
        inner ob2=new inner();      //1st method to create inner object
        ob2.show();
        
        a=10;
        System.out.println(a);
    }
    class inner
    {
        int b;
        void show()
        {
            b=20;
            System.out.println(b);
        }
    }
}
public class NestedClass 
{
    public static void main(String[] args)
    {
        outer ob=new outer();
        ob.display();
        outer.inner ib=ob.new inner();  //2nd method to create inner object
        ib.show();
    }
}
