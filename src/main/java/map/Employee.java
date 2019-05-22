package map;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary + "].";
    }
}
