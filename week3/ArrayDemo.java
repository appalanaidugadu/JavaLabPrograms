public class ArrayDemo
{
 public static void main(String arr[])
 {
     int a[]={1,6,1,1,5};
     int b,i,sum=0;
     b=a.length;
     for(i=0;i<b;i++)
     {
         sum=sum+a[i];
     }
      System.out.print(sum+"\t");
 }
}
