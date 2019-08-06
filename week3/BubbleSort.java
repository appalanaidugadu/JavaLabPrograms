import java.util.*;
public class BubbleSort
{
 public static void main(String[] args)
 {
     int a[]=new int[20];
     int i,b;
     System.out.println("Enter length of the array:");
     Scanner ob=new Scanner(System.in);
     b=ob.nextInt();
     System.out.println("Enter array elements:");
     for(i=0;i<b;i++)
     {
         a[i]=ob.nextInt();
     }
     System.out.print("Entered array is:");
             for(i=0;i<b;i++)
             {
              System.out.print(a[i]+"\t");
             }
             System.out.print("\n");
             int j,temp;
             for(i=b-1;i>0;i--)
             {
                 for(j=0;j<i;j++)
                 {
                     if(a[j]>a[j+1])
                     {
                         temp=a[j];
                         a[j]=a[j+1];
                         a[j+1]=temp;
                     }
                 }
             }
             System.out.print("After sorting the Array is:");
             for(i=0;i<b;i++)
             {
                 System.out.print(a[i]+"\t");
             }
 }
}

