package Reflect;

public class UserService {
    public void login(String name, String password) {
        if("123".equals(name) && "123".equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
    }

    public void logout() {
        System.out.println("退出");
    }
}
