package observer;

public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriber2: " + message.getMessage());
    }
}