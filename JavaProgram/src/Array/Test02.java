package Array;
/*
    main方法的String[] args的作用
        JVM负责调用main方法
        JVM调用main方法的时候，会自动传一个String数组过来

 */
public class Test02 {
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象的长度默认为0
        //args不为null
        //IDEA 可以在Run->Edit Configurations->Program argumens一栏中填写args要接收的信息，同样用空格隔开
        System.out.println("JVM传递过来的args数组长度 = " + args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        //以下代码表示，数组对象创建了，但是数组中没有任何数据
        //String[] args = new String[0];
        //String[] args = {};

        //args什么时候会有值呢？
        //main方法的args数组是留给用户的，用户可以在控制台输入参数，这个参数自动会转换为“String[] args”
        //例如在控制台运行程序：java Test02 abc def xyz
        //那么这个时候JVM会自动将abc def xyz通过空格的方式进行分离，然后放到args数组中
        //所以main方法上的args数组主要使用来接收用户输入参数的
        //把abc def xyz转换成字符串数组{"abc", "def", "xyz"};
        //IDEA 可以在Run->Edit Configurations->Program argumens一栏中填写args要接收的信息，同样用空格隔开

        //用户名和密码登录
        String username = args[0];
        String password = args[1];
        //尽量避免空指针异常
        if(username.equals("刘哲昊") && "990327".equals(password)) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("用户名或密码不正确！");
        }
    }
}
