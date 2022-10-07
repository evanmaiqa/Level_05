public class Employee extends Person{
    double salary;
//    public Employee (String name, int age, char sex, int yearOfBirth, double salary) {
//        super(name, age, sex, yearOfBirth);
//        this.salary = salary;
//    }

    public Employee (Person person, double salary) {
        super(person);
        this.salary = salary;
    }
    public boolean isSameName (Employee employee) {
        if (Employee.this.getName().equals(employee.getName())) {
            return true;
        }
        return false;
    }

}
