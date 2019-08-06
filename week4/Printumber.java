class 
public class Printumber
{
    public static void main(String[] args)
{
    
}
    
public class PrintNumber { 
	public static void main(String[] args) {
		printNumber(1);
	}
 
	public static void printNumber(int number) {
		if(number <= 100) {
			System.out.println(number);
			number++;
			printNumber(number);			//Note: method calling itself
		}else {
			System.exit(0);
		}
	}
}