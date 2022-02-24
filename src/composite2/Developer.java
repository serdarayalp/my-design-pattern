package composite2;

public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee getEmployee(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("\t-------------");
        System.out.println("\tName =" + getName());
        System.out.println("\tSalary =" + getSalary());
        System.out.println("\t-------------");
    }

    public void add(Employee employee) {

    }

    public void remove(Employee employee) {

    }

}