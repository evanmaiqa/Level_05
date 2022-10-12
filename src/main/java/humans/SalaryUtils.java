package humans;

/**
 * поиск сотрудника в массиве по его имени
 * поиск сотрудника в массиве по вхождению указанной строки в его имени
 * подсчет зарплатного бюджета для всех сотрудников в массиве
 * поиск наименьшей зарплаты в массиве
 * поиск наибольшей зарплаты в массиве
 */
public class SalaryUtils {
    // метод должен возвращать сумму зарплат
    public static double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }
        return sum;
    }
    // поиск сотрудника в массиве по его имени
    public static Employee findEmployee(String name, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static void isEmployeeExist (Employee employee) {
        if (employee == null) {
            System.out.println("по его имени_ Employee not found");
        } else {
            System.out.println(String.format("по его имени_ %s %s %d %f", employee.getName(), employee.getSex(), employee.getAge(), employee.getSalary()));
        }
    }

    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findEmployeeByString (String name, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                return employee;
            }
        }
        return null;
    }
    // подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double fullSalaryOfEmployees (Employee[] employees) {
        double salary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }
    // поиск наименьшей зарплаты в массиве
    public static double findMaxSalary (Employee[] employees) {
        double salary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                salary = employee.getSalary();
            }
        }
        return salary;
    }
    // поиск наибольшей зарплаты в массиве\
    public static double findMinSalary (Employee[] employees) {
        double salary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                salary = employee.getSalary();
            }
        }
        return salary;
    }
    // checking an array for emptiness
    public static boolean isArrayEmptiness(Employee[] employees) {
        return employees.length <= 0;
    }
}
