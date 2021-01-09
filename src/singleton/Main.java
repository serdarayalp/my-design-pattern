package singleton;

public class Main {
    public static void main(String[] args) {

        MySingleton object1 = MySingleton.createObject();
        MySingleton object2 = MySingleton.createObject();

        if (object1 == object2) {
            System.out.println("beide Objekte sind gleich...");
        }
    }
}
