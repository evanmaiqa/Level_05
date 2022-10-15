package Last_XB;

public class Month {
    private String nameOfMonth;
    private int days;
    private int daysOfWork;

    public Month(String nameOfMonth, int days, int daysOfWork) {
        this.nameOfMonth = nameOfMonth;
        this.days = days;
        this.daysOfWork = daysOfWork;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getDays() {
        return days;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }
}
