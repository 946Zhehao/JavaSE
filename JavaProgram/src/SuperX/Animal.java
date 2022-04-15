package SuperX;

public class Animal {
    private int age;
    private int length;
    private String name;

    //构造方法
    public Animal() {
        System.out.println("动物出生了！");
    }

    public Animal(int age, int length, String name) {
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
