package FengZhuang;

public class User {
    private int age;
    private String name;

    //无参构造方法    若不写任何构造方法，则默认有无参构造方法
    public User(){

    }
    //构造方法
    public User(int age) {
        this.age = age;
    }
    //构造方法
    public User(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
