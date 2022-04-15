package Annotation;
/*
自定义注解
    注解当中的属性可以是以下任意一种类型
        byte short int long float double boolean char String Class 枚举类型
        以及每一种的数组形式
 */
public @interface MyAnnotation {
    /**
     * 我们通常在注解当中可以定义属性，以下这个是MyAnnotation的name属性
     * 看着像一个方法，但实际上我们称之为属性name
     * @return
     */
    String name();

    String color();

    int age() default 25;   //给定默认值，这样就不用使用注解时再赋值

}
