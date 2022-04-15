package Exception;
/*
1、编译时异常和运行时异常，都发生在运行阶段，编译阶段异常是不会发生的
编译时异常必须在编译（编写）阶段预先处理，如果不处理编译器报错，因此得名
所有异常都是在运行阶段发生的，因为只有程序运行阶段才可以new对象
因为异常的发生就是new异常对象

2、编译时异常和运行时异常的区别？
    编译时异常（又叫受检异常或受控异常）一般发生的概率比较高
    运行时异常（又叫非受检异常或非受控异常）一般发生的概率比较低
假设Java中没有对异常进行划分，所有的异常偶在编写程序阶段进行预处理，
这样的程序是绝对安全的，但程序员编写程序太累，代码导出都是处理异常的代码。

3、Java对异常的处理有两种方式
    第一种：在方法生明的位置上，使用throws关键字，抛给上一级
    第二种：使用try..catch语句进行异常的捕捉
    异常发生后，如果一直上抛，最终抛给了main方法，main方法继续上抛，抛给了调用者 JVM，
    JVM知道这个异常发生，只有一个结果：终止Java程序执行
    只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行
    另外，try语句块中的某一行出现异常，该行后面的代码不会执行。

4、上抛和捕捉如何选择？
    如果希望调用者处理，用throws上抛
    其他情况都用捕捉
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        main方法调用的doSome()方法
        由于doSome()方法有异常抛出
        所以调用时必须对异常隐形预先的处理
        否则编译器会报错
         */

        //捕捉异常
        //try..catch
        /*
        catch 后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
        catch 可以写多个。建议catch的时候，精确的一个一个处理，这样有利于程序的调试
        catch 写多个的时候， 从上到下，必须遵循从小到大，先抛出子类异常对象，再抛出父类异常对象
         */
        /*
        try {
            doSome();
        } catch(ClassNotFoundException cnfe) {
            //cnfe这个引用存放的是异常对象的地址
            cnfe.printStackTrace();
            System.out.println("出现异常！");
        } catch(Exception e) {
            System.out.println("");
        }
        */

        doSome();
    }
    /*
    doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
    这个代码表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常。
    叫做类没有找到异常，这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("Hello World!");
    }
}
