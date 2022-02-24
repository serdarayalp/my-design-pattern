package composite2;

public class Main {

    public static void main(String[] args) {

        Employee dev1 = new Developer("John", 10000);
        Employee dev2 = new Developer("David", 15000);

        Employee manager1 = new Manager("Daniel", 25000);
        manager1.add(dev1);
        manager1.add(dev2);

        Employee dev3 = new Developer("Michael", 20000);

        Manager generalManager = new Manager("Mark", 50000);
        generalManager.add(dev3);
        generalManager.add(manager1);

        generalManager.print();
    }
}