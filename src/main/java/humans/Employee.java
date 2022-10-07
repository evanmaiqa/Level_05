package humans;

public class Employee extends Person {
    private double salary;
    public Employee (String name, char sex, int yearOfBirth, double salary) {
        super(name, sex, yearOfBirth);
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSameName (Employee employee) {
        if (Employee.this.getName().equals(employee.getName())) {
            return true;
        }
        return false;
    }

}
