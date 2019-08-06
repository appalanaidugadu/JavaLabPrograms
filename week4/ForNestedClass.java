class outer2
{
    int a=10;
    void display()
    {
        void print();
        {
            System.out.println(b);
        }
        for(int i=0;i<10;i++)
        { 
            class inner2
            {
                int b;
                void show()
                {
                    System.out.println(a);
                }
        }
            inner2 ob=new inner2();
            ob.show();
    }
}
public class ForNestedClass 
{
public static void main(String[] args)
    {
        outer2 ob=new outer2();
        ob.print();
        
    }
}
