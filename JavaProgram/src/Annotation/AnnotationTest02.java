package Annotation;


public class AnnotationTest02 {
    public static void main(String[] args) {
        T.doSome();
    }
}

//表示这个类已过时
@Deprecated
class T{
    //表示这个方法已过时
    @Deprecated
    public static void doSome() {
        System.out.println("do something!");
    }

    public static void doOther() {
        System.out.println("do other...");
    }
}
