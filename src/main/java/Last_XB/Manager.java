package Last_XB;

public class Manager extends Worker{
    private int numberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }
    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (numberOfSubordinates / 100 * 3);
    }
}
