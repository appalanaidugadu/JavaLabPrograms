import java.util.*;
class reverse
{
public static void main(String ar[])
{
System.out.print("Enter a string:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
int l=s.length();
System.out.print("reversed String is:");
for(int i=(l-1);i>=0;i--)
{
char d=s.charAt(i);
System.out.print(d);
}
}
}