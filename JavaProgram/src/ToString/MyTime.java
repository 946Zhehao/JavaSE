package ToString;

public class MyTime {
    private int year;
    private int month;
    private int day;

    public MyTime(){

    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}
