import java.lang.String;
class Str
{
	public static void main(String[] args)
	{
	   String a="java";
	   System.out.println(a);
	   String s1=new String();
	   s1="Naidu";
	   System.out.println(s1);
	   String s2=new String("appi");
	   System.out.println(s2);
	
	   char str[]={'n','a','i','d','u'};
	   String b=new String(str);
	   System.out.println(b);

	   String s3=new String(str,0,5);
	   System.out.println(s3);

	}
}
