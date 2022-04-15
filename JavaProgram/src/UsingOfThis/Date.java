package UsingOfThis;

public class Date {
    private int year;
    private int month;
    private int day;

    //调用无参构造是默认时间1999-03-27
    public Date(int i) {
        //this()只能出现在第一行
        this(1999, 03, 27);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print(){
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }
}
