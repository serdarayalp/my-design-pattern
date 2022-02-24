package command;

public class BuyStockCommand implements OrderCommand {

    private Stock stock;

    public BuyStockCommand(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}