class Calc
{
    int num1;
    int num2;
    int result;
    public void perform()
    {
        result=num1+num2;
    }
}
public class ObjectDemo
{
    public static void main(String[] args)
    {
        Calc obj=new Calc();
        obj.num1=3;
        obj.num2=5;
        obj.perform();
        System.out.println("num1 value is:"+obj.num1);
        System.out.println("num2 value is:"+obj.num2);
        System.out.println("And the result is:"+obj.result);
    }
}