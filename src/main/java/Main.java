public class Main {
    public static void main(String[] args) {
        Person person_0 = new Person("Ivan", 42, 'm', 1980);
        Person person_1 = new Person("Anne", 23, 'w', 1999);
        Person person_2 = new Person("Otto", 12, 'm', 2010);
        Person person_3 = new Person("Wolfram", 101, ' ', 1548);
//
//        Employee employee_0 = new Employee("Ivan", 42, 'm', 1980, 1000);
//        Employee employee_1 = new Employee("Anne", 23, 'w', 1999, 1500);
//        Employee employee_2 = new Employee("Otto", 12, 'm', 2010, 1000);
//        Employee employee_3 = new Employee("Wolfram", 101, ' ', 1548, 1500);

        Employee employee_0 = new Employee(person_0,  1000);
        Employee employee_1 = new Employee(person_1, 1500);

        System.out.println(employee_0.getName());
//        System.out.println(employee_0.isSameName(employee_0));
//        System.out.println(employee_0.isSameName(employee_1));


        System.out.println(String.format("%s is %d years old",person_0.getName(), person_0.getAge()));

    }
}