package Annotation;


public class ValueAnnotationTest {
    @ValueAnnotation(value = "hehe")
    public void doSome() {

    }
    //如果一个注解的属性名是value，并且仅有这一个属性，属性名可以省略不写
    @ValueAnnotation("haha")
    public void doOther() {

    }
}
