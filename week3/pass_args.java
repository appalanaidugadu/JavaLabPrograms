class pass_args1
{
 int l,b;
 void display(int x,int y)
 {
     int a,p;
     l=x;
     b=y;
     a=x*y;
     System.out.println("Area of rectangle is:"+a);
     p=2*(l+b);
     System.out.println("Perimeter of rectangle is:"+p);
 }
}
class pass_args
{
    public static void main(String[] args)
    {
        pass_args1 ob1=new pass_args1();
       int c=10,d=20;
       ob1.display(c,d);
    }
}


