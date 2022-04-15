package Exception;
/*
异常处理
1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
2、异常对应的现实生活中是怎样的
    火灾（异常类）：
        2008年8月8日。小明家着火了（异常对象）
        2008年8月9日。小红家着火了（异常对象）
        2008年8月10日。小刚家着火了（异常对象）
3、只要异常发生了，就会new一个对应的异常对象
4、子类不能比父类抛出更多的异常
    若父类不抛异常，子类可以抛出运行时异常（RuntimeException），不可以抛出编译时异常(Excepiton)
 */
public class Test {
    public static void main(String[] args) {
        /*
        //通过异常类实例化异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);    //java.lang.NumberFormatException: 数字格式化异常

        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);    //java.lang.NullPointerException: 空指针异常
        */


    }
}
