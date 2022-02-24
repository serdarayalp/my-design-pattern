package command;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock("Harddisk", 1000);

        BuyStockCommand buyStockCommand = new BuyStockCommand(stock);
        SellStockCommand sellStockCommand = new SellStockCommand(stock);

        Broker broker = new Broker();

        broker.takeOrder(buyStockCommand);
        broker.takeOrder(sellStockCommand);

        broker.placeOrders();
    }
}