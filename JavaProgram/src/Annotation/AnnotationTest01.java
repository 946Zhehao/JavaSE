package Annotation;
/*
1、注解，或者叫注释，英文：Annotation
2、注解Annotation是一种引用数据类型，编译之后生成xxx.class文件
3、如何自定义注解？语法格式？
    [修饰符列表] @interface 注解类型名{
    }
4、注解怎么使用，用在什么地方？
    1、注解使用时的语法格式是：
        @注解类型名
    2、注解可以出现在类上，属性上，方法上，变量上等
        注解还可以出现在注解类型上
        默认情况下可以出现在任意位置
5、JDK内置了那些注解
    java.lang包下的注释类型：
        掌握：
        Deprecated 用@Deprecated注释的程序元素，表示已过时
        不鼓励程序员使用这样的元素，通常是因为它很危险或存在更好的选择
        掌握：
        Override表示一个方法生命打算重写超类中的另一个方法声明
        Override只能注解方法，是给编译器参考的，和运行阶段无关
        如果这个方法不是重写父类的方法，编译器报错
        不用掌握：
        SuppressWarnings指示应该在注释元素（以及包含在改注释元素中的所有程序元素）
        中取消显示指定的编译器警告
6、元注解
    用来标注“注解类型”的“注解”，称为元注解
    常见的元注解：
        Target
        Retention
    关于Target注解：
        这是一个元注解，用来标注“注解类型”的“注解”
        这个Target注解用来标注“被标注的注解”可以出现在那些位置上。

        @Target(ElementType.METHOD)：表示”被标注的注解“只能出现在方法上
    关于Retention注解:
        这也是一个元注解
        这个Retention注解用来标注”被标注的注解“最终保存在哪里

        @Retention(RetentionPolicy.SOURCE):表示该注解只被保留在java源文件中
        @Retention(RetentionPolicy.CLASS):表示该注解只被保留在class文件中
        @Retention(RetentionPolicy.RUNTIME):表示该注解只被保留在class文件中,并且可以被反射机制所读取
 */
@AnnotationToken
public class AnnotationTest01 {

    @AnnotationToken
    private int num;

    @AnnotationToken
    public AnnotationTest01() {

    }

    @AnnotationToken
    public static void m1() {
        @AnnotationToken
        int i = 100;
    }

    @AnnotationToken
    public void m2(@AnnotationToken
                   String name,
                   @AnnotationToken
                   int k) {

    }
}
@AnnotationToken
interface Ine {

}

@AnnotationToken
enum Season {
    Summer, Spring, Winter,
}