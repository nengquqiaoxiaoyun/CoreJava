package core.java.chapter5.abstractClasses;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author: huakaimay
 * @since: 2020-08-18
 */
public class Employee extends Person {


    private double salary;

    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "{salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
