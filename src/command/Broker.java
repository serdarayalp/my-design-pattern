package command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<OrderCommand> commandList = new ArrayList<>();

    public void takeOrder(OrderCommand orderCommand) {
        commandList.add(orderCommand);
    }

    public void placeOrders() {
        for (OrderCommand order : commandList) {
            order.execute();
        }
        commandList.clear();
    }
}