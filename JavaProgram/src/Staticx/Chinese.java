package Staticx;

public class Chinese {
    //身份证号
    private int id;
    //名字
    private String name;
    //国籍    静态变量存放在方法区内存中，一组对象公用一个静态变量，类加载时直接初始化
    private final static String country = "中国";

    public Chinese() {
    }

    public Chinese(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Setter  Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCountry() {
        return country;
    }

}
