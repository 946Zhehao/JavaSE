package Extends;

public class Animals {
    private int age;
    private int length;
    private String name;

    //
    public void move(){
        System.out.println("跑！");
    }
    //
    protected void eat(){
        System.out.println("吃！");
    }


    //构造方法
    public Animals() {
    }

    public Animals(int age, int length, String name) {
        this.age = age;
        this.length = length;
        this.name = name;
    }

    //Setter  Getter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
