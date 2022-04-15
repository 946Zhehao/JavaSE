package Annotation;

public @interface ValueAnnotation {
    //指定一个value属性
    //如果一个注解的属性名是value，并且仅有这一个属性，属性名可以省略不写
    String value();

    //String color();
}
