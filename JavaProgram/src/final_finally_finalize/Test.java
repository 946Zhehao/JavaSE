package final_finally_finalize;
/*
final_finally_finalize的区别
 */
public class Test {
    public static void main(String[] args) {
        //final是一个关键字，表示最终的，不变的
        //final修饰的类无法继承，修饰的变量无法重新赋值，修饰的方法无法覆盖
        final int i = 100;

        //finally 也是一个关键字，和try联合使用，使用在异常处理机制中
        //在finally中的语句一定会执行
        try {

        } finally {
            System.out.println("finally");
        }

        //finaliz()是Object类中的一个方法，作为方法名出现
        //所以finalize是标识符
    }
}
