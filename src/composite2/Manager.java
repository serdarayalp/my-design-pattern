package composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

    List<Employee> employees = new ArrayList<>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {

        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }
}