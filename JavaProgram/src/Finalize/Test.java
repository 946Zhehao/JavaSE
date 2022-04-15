package Finalize;
/*
    详细看老杜P538， finalize()已过时
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p = null;
    }
}
