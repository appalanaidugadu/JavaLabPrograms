class LifetimeScope 
{ 
    int a=30;
   float b=4.2f;
    double c=34.3;
}
class kir
{
 public static void main(String[] args)
 {
     LifetimeScope ob=new LifetimeScope();
     System.out.println(ob.a);
      System.out.println(ob.b);
       System.out.println(ob.c);
}
}

