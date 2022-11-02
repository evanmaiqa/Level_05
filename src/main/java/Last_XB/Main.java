package Last_XB;
import Last_XB.EmployeeExtra.Employee;

public class Main {
    static <T> void printA(T[] arr){

    }
    public static void main(String[] args) {

        Employee employee = new Employee("Otto", 31, 'm', 10);
        Month[] months = {new Month("January", 31, 21),
                new Month("February", 28, 20)};

        System.out.println(employee.getSalary(months));
//        Manager manager = new Manager(1000, "Otto", 30);
//        Manager manager1 = new Manager(1000, "Anne", 0);
//
//        System.out.println(manager.getSalary());
//        System.out.println(manager1.getSalary());
//
//        Director director = new Director(1000, "Otto", 30);
//        Director director1 = new Director(1000, "Anne", 0);
//
//        System.out.println(director.getSalary());
//        System.out.println(director1.getSalary());
    }
}
