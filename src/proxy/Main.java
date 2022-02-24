package proxy;

public class Main {
    public static void main(String[] args) {

        Internet internet = new Internet();
        Proxy proxy = new Proxy(internet);

        try {
            proxy.connect("my_domain.com");
            proxy.connect("banned_url_1.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}