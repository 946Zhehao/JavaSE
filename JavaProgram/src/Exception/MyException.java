package Exception;
/*
自定义异常
    第一步：编写一个类继承Exception或者RuntimeException
    第二步：提供两个构造方法，一个无参数，一个带有String参数
 */
public class MyException extends Exception{     //编译时异常
    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }
}

/*
public class MyException extends RuntimeException {     //运行时异常
}
 */