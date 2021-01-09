package singleton;

public class MySingleton {

    private static MySingleton mySingleton;

    private MySingleton() {
        // nichts
    }

    public static MySingleton createObject() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
