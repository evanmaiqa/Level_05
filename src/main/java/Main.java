import humans.Employee;
import humans.Person;
import humans.SalaryUtils;

public class Main {
    public static void main(String[] args) {

        Employee employee_0 = new Employee("Ivan", 'm', 1980, 1000);
        Employee employee_1 = new Employee("Anne", 'w', 1999, 1500);
        Employee employee_2 = new Employee("Otto", 'm', 2010, 1000);
        Employee employee_3 = new Employee("Wolfram", ' ', 1548, 1500);

        Employee[] employees = {employee_0, employee_1, employee_2, employee_3};

        System.out.println(employee_0.isSameName(employee_0));
        System.out.println(employee_0.isSameName(employee_1));

// метод должен возвращать сумму зарплат
        System.out.println(SalaryUtils.getSum(employees));

// поиск сотрудника в массиве по его имени
        SalaryUtils.isEmployeeExist(SalaryUtils.findEmployee("Ivan", employees));


    }
}