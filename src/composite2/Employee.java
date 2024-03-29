package composite2;

public interface Employee {

    public void add(Employee employee);

    public void remove(Employee employee);

    public Employee getEmployee(int i);

    public String getName();

    public double getSalary();

    public void print();
}
