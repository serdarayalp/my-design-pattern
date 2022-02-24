package observer;

public interface Subject {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void sendMessage(Message message);
}