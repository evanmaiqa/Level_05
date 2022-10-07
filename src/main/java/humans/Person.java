package humans;

import java.time.Year;
import java.util.Calendar;

/**
 *
 */
public class Person {
    protected String name;
    private char sex;
    private int yearOfBirth;

    public Person(String name, char sex, int yearOfBirth) {
        this(name); // invoking constructor from 18 line like humans.Person person = new humans.Person("Otto");
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(String hisName) {
        name = hisName;
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

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

//    public int getAgeVersion2() {
//        return Year.now().getValue() - yearOfBirth;
//    }
    public String getName() {
        return name;
    }
//    public String getName() {
//        if (this.sex == 'm') {
//            return "Mr. " + name;
//        } else if (this.sex == 'w') {
//            return "Ms. " + name;
//        }
//        return name;
//    }
    public void printName() {
        System.out.println(this.getName());
    }
}
