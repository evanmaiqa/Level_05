package Last_XB;

public class MonthUtils extends Month{
    public MonthUtils(String nameOfMonth, int days, int daysOfWork) {
        super(nameOfMonth, days, daysOfWork);
    }

    private static Month[] MONTH_ARRAY = new Month[] {
            new Month("January", 31, 21),
            new Month("February", 28, 20),
            new Month("March", 31, 23),
            new Month("April", 30, 22),
            new Month("May", 31, 21),
            new Month("June", 30, 22),
            new Month("July", 31, 22),
            new Month("August", 31, 22),
            new Month("September", 30, 22),
            new Month("October", 31, 21),
            new Month("November", 30, 22),
            new Month("December", 31, 23)
    };

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }
}
