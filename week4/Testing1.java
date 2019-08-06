class Test
{
    Test()
    {
        System.out.println("Constructor");
    }
    void display()
    {
        System.out.println("Hello");
    }
    void print()
        {
            display();
            System.out.println("Hai");
        }
    }
public class Testing1 {
    public static void main(String[] args)
    {
        Test obj=new Test();
                obj.print();
        Test obj2=new Test();
    }    
}
