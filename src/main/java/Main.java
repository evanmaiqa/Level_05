import humans.Employee;
import humans.Person;
import humans.SalaryUtils;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("Ivan", 'm', 1980, 1000)
                , new Employee("Anne", 'w', 1999, 1500)
                , new Employee("Otto", 'm', 2010, 1000)
                , new Employee("Wolfram", ' ', 1548, 1500)
        };
//        Employee[] employees = new Employee[0];
        if (SalaryUtils.isArrayEmptiness(employees)) {
            System.out.println("No employees...");
            System.exit(0);
        }
//        System.out.println(employee_0.isSameName(employee_0));
//        System.out.println(employee_0.isSameName(employee_1));

        // метод должен возвращать сумму зарплат
        System.out.println(String.format("метод возвращат сумму зарплат_ %.2f", SalaryUtils.getSum(employees)));

        // поиск сотрудника в массиве по его имени
        SalaryUtils.isEmployeeExist(SalaryUtils.findEmployee("Ivan", employees));
        System.out.println("----------------------");
        System.out.println(SalaryUtils.findEmployee("Otto", employees));
        System.out.println(SalaryUtils.findEmployee("Ott", employees));
        System.out.println("----------------------");

        // поиск сотрудника в массиве по вхождению указанной строки в его имени
        System.out.println("по вхождению указанной строки_ " + SalaryUtils.findEmployeeByString("Ivaa", employees));

        // подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println("бюджет : " + SalaryUtils.fullSalaryOfEmployees(employees));

        // поиск наименьшей зарплаты в массиве
        System.out.println("наименьшей зарплаты_ " + SalaryUtils.findMinSalary(employees));

        // поиск наибольшей зарплаты в массиве
        System.out.println("наибольшей зарплаты_ " + SalaryUtils.findMaxSalary(employees));
    }
}