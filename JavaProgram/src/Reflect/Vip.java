package Reflect;

public class Vip {
    int num;
    String name;
    boolean flag;

    public Vip() {

    }

    public Vip(int num) {
        this.num = num;
    }

    public Vip(String name) {
        this.name = name;
    }

    public Vip(boolean flag) {
        this.flag = flag;
    }

    public Vip(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Vip(String name, boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    public Vip(int num, boolean flag) {
        this.num = num;
        this.flag = flag;
    }

    public Vip(int num, String name, boolean flag) {
        this.num = num;
        this.name = name;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
