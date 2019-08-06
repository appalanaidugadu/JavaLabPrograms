class Areas{
    int l,b;
    float r;
    double p,q;
    void area(int x,int y)
    {
        l=x;
        b=y;
        System.out.println("Area of Rectangle"+l*b);
    }
   void area(float a)
    {
        r=a;
        System.out.println("Area of Circle:"+Math.PI*r*r);
    }
    void area(double p,double q)
    {
        p=l;
        q=b;
        System.out.println("Area of Triangle:"+0.5*p*q);
    }
}
public class AreaObjects {
    public static void main(String[] args)
    {
       Areas ob=new Areas();
       ob.area(10,5);
       ob.area(5.5f);
       ob.area(4.5,7.5);
}
}