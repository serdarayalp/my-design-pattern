package proxy;

public class Internet implements InternetInterface {
    @Override
    public void connect(String url) {
        System.out.println("Connecting to " + url);
    }
}