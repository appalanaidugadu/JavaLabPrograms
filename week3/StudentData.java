public class StudentData 
{
    int rno;
    long phno;
    void display()
    {
        System.out.println("student phone number is:"+phno);
        System.out.println("student roll number is:"+rno);
        
    }
    
}
class kal
{
    public static void main(String[] args)
    {
        StudentData ob1=new StudentData();
        ob1.phno=701321792;
        ob1.rno=36;
        ob1.display();
    }
}
