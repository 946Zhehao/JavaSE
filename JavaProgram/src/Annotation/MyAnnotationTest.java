package Annotation;

public class MyAnnotationTest {
    //报错原因：如果一个注解当中有属性，那么必须给属性赋值
    /*
    @MyAnnotation
    public void doSome() {
    }
     */

    //@MyAnnotation(属性名 = 属性值)
    @MyAnnotation(name = "皇叔", color = "Red")
    public void doSome() {

    }
}
