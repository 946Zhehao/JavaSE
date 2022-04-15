package Annotation;
/*
反射注解
 */
public class ReflectAnnotation {
    public static void main(String[] args) throws
            Exception {
        //获取类
        Class c = Class.forName("Annotation.LimitAnnotaionTest");
        //判断类上面是否有@LimitAnnotation
        System.out.println(c.isAnnotationPresent(LimitAnnotation.class));   //true

        if(c.isAnnotationPresent(LimitAnnotation.class)) {
            //获取注解对象
            LimitAnnotation limitAnnotation = (LimitAnnotation) c.getAnnotation(LimitAnnotation.class);
            System.out.println("类上的注解对象" + limitAnnotation);
            //获取注解对象的属性,直接 注解对象.属性
            String value = limitAnnotation.value();
            System.out.println(value);
        }
    }
}
