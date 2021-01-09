package proxy;

public class Client {
    public static void main(String[] args) {

        ProxyInternet proxyInternet = new ProxyInternet();

        try {
            proxyInternet.connectTo("geeksforgeeks.org");
            proxyInternet.connectTo("aBc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}