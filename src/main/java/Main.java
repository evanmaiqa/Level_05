public class Main {
    public static void main(String[] args) {
        Person person0 = new Person("Ivan", 42, 'm', 1980);
        Person person1 = new Person("Anne", 23, 'w', 1999);
        Person person2 = new Person("Otto", 12, 'm', 2010);
        Person person3 = new Person("Wolfram", 101, ' ', 1548);
//
        System.out.println(person2.getName());
        person2.setName("Ufo");
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        System.out.println(String.format("%s is %d years old",person0.getName(), person0.getAge()));
        System.out.println("helll");

    }
}