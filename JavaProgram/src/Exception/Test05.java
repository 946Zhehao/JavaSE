package Exception;
/*
finally语句
 */
public class Test05 {
    public static void main(String[] args) {
        /*
        以下代码的执行顺序
            try
            finally
            return
         */
        try {
            System.out.println("try");
            //退出JVM
            //System.exit(0); //退出JVM之后，finally语句中的代码就不执行了
            return;
        } finally {
            System.out.println("finally");
        }

        //由于上面有return以下代码执行不到
        //System.out.println("Hello World!");
    }
}
