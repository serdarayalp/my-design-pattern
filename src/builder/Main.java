package builder;

import singleton.MySingleton;

public class Main {
    public static void main(String[] args) {

        MySingleton object1 = MySingleton.createObject();
        MySingleton object2 = MySingleton.createObject();

        if (object1 == object2) {
            System.out.println("beide Objekte sind gleich...");
        }


        // Cake cake = new Cake.Builder(500, 500).butter(200).chocolate(300).build();
        Cake.CakeBuilder cakeBuilder = new Cake.CakeBuilder(500, 500);
        // Optional
        cakeBuilder.butter(200);
        cakeBuilder.chocolate(300);

        Cake cake = cakeBuilder.build();

        System.out.println(cake.toString());

    }
}
