package Annotation;

public class OtherAnnotationTest {
    @OtherAnnotation(age = 10, email = {"asdasx", "asdasdqw"})
    public void doSome() {

    }
    //如果数组只有一个值，大括号可以省略
    @OtherAnnotation(age = 20, email = "xzcad")
    public void doOther() {

    }
}
