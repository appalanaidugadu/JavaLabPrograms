class Box
{
    int l,b;
    public void area()
    {
        System.out.println("Area is:"+(l*b));
    }
    public void perimeter()
    {
           System.out.println("Perimeter is:"+(2*(l+b)));

    }
}
public class Rectangle {
    public static void main(String[] args)
    {
        Box obj=new Box();
        obj.l=10;
        obj.b=5;
        obj.area();
        obj.perimeter();
        
    }
    
}
