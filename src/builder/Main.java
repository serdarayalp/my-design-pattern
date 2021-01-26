package builder;

import singleton.MySingleton;

public class Main {
    public static void main(String[] args) {
        // Cake cake = new Cake.Builder(500, 500).butter(200).chocolate(300).build();
        Cake.CakeBuilder cakeBuilder = new Cake.CakeBuilder(500, 500);
        // Optional
        cakeBuilder.butter(200);
        cakeBuilder.chocolate(300);

        Cake cake = cakeBuilder.build();

        System.out.println(cake.toString());

    }
}
