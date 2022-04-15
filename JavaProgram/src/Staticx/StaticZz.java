package Staticx;

public class StaticZz {
    //静态代码块
    //类加载时执行，并且仅执行一次
    static{
        System.out.println("类加载-->1");
    }
    //静态代码块
    static{
        System.out.println("类加载-->2");
    }

    //静态代码块
    static{
        System.out.println("类加载-->3");
    }

    //静态代码块
    static{
        System.out.println("类加载-->4");
    }

    //实例代码块    类加载时执行，用的非常少
    {
        System.out.println("实例--->1");
    }
    //实例代码块
    {
        System.out.println("实例--->1");
    }
    //实例代码块
    {
        System.out.println("实例--->1");
    }
}
