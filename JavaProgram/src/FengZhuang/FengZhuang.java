package FengZhuang;

public class FengZhuang {
    public static void main(String[] args) {
        User user = new User("张三");
        //user.setAge(20);
        int age = user.getAge();
        System.out.println(user.getName());
    }
}
