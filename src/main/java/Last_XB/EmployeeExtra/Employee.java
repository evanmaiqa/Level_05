package Last_XB.EmployeeExtra;

import Last_XB.Month;
import Last_XB.MonthUtils;

public class Employee{
    private String name;
    private int age;
    private char sex;
    private double salary;

    public Employee(String name, int age, char sex, double salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
    public double getSalary(Month[] monthArray) {
        int days = 0;
        for(Month i : monthArray) {
            days += i.getDaysOfWork();
        }
        return getSalary() * days;
    }
}
