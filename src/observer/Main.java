package observer;

public class Main {
    public static void main(String[] args) {

        MessageSubscriber1 s1 = new MessageSubscriber1();
        MessageSubscriber2 s2 = new MessageSubscriber2();
        MessageSubscriber3 s3 = new MessageSubscriber3();

        MessagePublisher p = new MessagePublisher();

        p.addObserver(s1);
        p.addObserver(s2);

        p.sendMessage(new Message("Hello Maxi"));   //s1 and s2 will receive the update

        p.deleteObserver(s1);
        p.addObserver(s3);

        p.sendMessage(new Message("Hello Max")); //s2 and s3 will receive the update
    }
}