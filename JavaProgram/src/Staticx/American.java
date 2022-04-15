package Staticx;

public class American {
    //身份证号
    private int id;
    //名字
    private String name;
    //国籍
    private final static String country = "美国";

    public American() {
    }

    public American(int id, String name) {
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
