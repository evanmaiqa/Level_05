package Last_XB;

public class Director extends Manager{
    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }
    @Override
    public double getSalary() {
        if (super.getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
    }
}
