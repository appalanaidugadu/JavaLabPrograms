import java.util.*;
class buffer
{
public static void main(String ar[])
{
System.out.print("Enter a String:");
Scanner  a=new Scanner(System.in);
String s=a.nextLine();
StringTokenizer b=new StringTokenizer(s, ",_");
int n=b.countTokens();
System.out.println("No.of tokens="+n);
boolean c=b.hasMoreTokens();
System.out.println(c);
StringBuffer d=new StringBuffer(s);
System.out.println(d.charAt(2)); 
System.out.println(d.capacity());
System.out.println(d.length());
System.out.println(d.append("Teach"));
System.out.println(d.reverse());
System.out.println(d.insert(7,"Rock"));
System.out.println(d.replace(4,5,"Sir"));
System.out.println(d.delete(3,5));
}
}