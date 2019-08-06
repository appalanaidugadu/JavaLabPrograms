import java.util.*;
class stringoperations
{
	public static void main(String[] args)
	{
	   Scanner ob=new Scanner(System.in);
	    System.out.println("enter string");
	    String s=ob.nextLine();
	    System.out.println(s);
	String b=" Java";
	   String s1=b.trim();
	   System.out.println(s1);
		
	  int n=5;
	   String s2,s3;
	   s2=s.substring(n);
	   System.out.println(s2);
	    s3=s.substring(3,6);
	    System.out.println(s3); 
	    
		     int a=10;
	     String s4=String.valueOf(a);
	     System.out.println(s4);

	}
}