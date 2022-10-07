import java.util.Calendar;

public class Person {
    String name;
    int age;
    char sex;
    private int yearOfBirth;
    public Person (String name, int age, char sex, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }
    public String getName(){
        if (sex == 'm') {
            return "Mr. " + name;
        } else if (sex == 'w') {
            return "Ms. " + name;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
