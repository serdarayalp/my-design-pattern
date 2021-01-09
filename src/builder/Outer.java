package builder;

public class Outer {

    public static void main() {
        Outer.Inner inner = new Outer.Inner();
        inner.myMethod();
    }

    public static class Inner {
        public void myMethod() {
            System.out.println("Das ist Inner-Klasse...");
        }
    }
}