package UsingOfThis;

public class UsingOfThis {
    public static void main(String[] args){
        //调用无参构造
        Date d1 = new Date(1);
        d1.print();
        //调用有参构造
        Date d2 = new Date(2021, 01, 02);
        d2.print();
    }
}
