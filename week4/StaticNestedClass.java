class outer1 {

    static int a = 10;

    static class inner1 {

        static void show() {
            System.out.println(a);
        }
    }
}
public class StaticNestedClass {

    public static void main(String[] args) {
        outer1.inner1.show();       //1st method
        outer1.inner1 ob = new outer1.inner1();       //2nd method
        ob.show();
    }
}
