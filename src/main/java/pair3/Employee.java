package pair3;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;
    private String name = "";

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.salary = salary;
        this.name = name;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
