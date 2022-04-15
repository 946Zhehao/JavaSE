package Exception;
/*
finally面试题
 */
public class Test06 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);     //100
    }
    /*
    java语法规则（一些规则是不能破坏的）
        方法体中的代码必须遵顼自上而下驯熟一次逐行执行（亘古不变）
        return语句一旦执行，整个方法必须结束（亘古不变）
     */
    public static int m() {
        int i = 100;

        try {
            /*
            这行代码出现再int i = 100的下面，所以最终结果必须是返回100
            return语句还必须保证是最后执行的。一旦执行，整个方法结束
            return一定是最后执行的
             */
            return 100;
        } finally {
            i++;
        }
    }
    //我的反编译之后的程序
    /*
     public static int m()
    {
        int i = 100;
        byte byte0 = 100;
        i++;
        return byte0;
        Exception exception;
        exception;
        i++;
        throw exception;
    }
     */
    //老杜的反编译之后的程序
    /*
     public static int m()
    {
        int i = 100;
        int j = i;
        i++;
        return j;
        Exception exception;
        exception;
        i++;
        throw exception;
    }

     */
}
