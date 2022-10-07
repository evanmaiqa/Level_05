import java.util.Calendar;

/**
 *
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private int yearOfBirth;

    public Person(String name, int age, char sex, int yearOfBirth) {
        this(name); // invoking constructor from 18 line like Person person = new Person("Otto");
        this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(String hisName) {
        name = hisName;
    }
    public Person(Person person) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public String getName() {
        if (this.sex == 'm') {
            return "Mr. " + name;
        } else if (this.sex == 'w') {
            return "Ms. " + name;
        }
        return name;
    }
}
