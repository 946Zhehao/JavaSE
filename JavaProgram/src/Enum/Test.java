package Enum;

/*
枚举
 */
public class Test {
    public static void main(String[] args) {
        /*
        boolean flag = divide(10, 5);
        System.out.println(flag ? "计算成功" : "计算失败");

        flag = divide(10, 0);
        System.out.println(flag ? "计算成功" : "计算失败");
        */

        Result flag = divide(10, 0);
        System.out.println((flag == Result.SUCCESS) ? "计算成功" : "计算失败");

    }

    public static Result divide(int a, int b) {
        try {
            int t = a / b;
            return Result.SUCCESS;
            //return true;
        }catch (Exception e) {
            return Result.FAIL;
            //return false;
        }
    }
}

/*
枚举：一枚一枚可以列举出来的，才建议使用枚举类型
枚举编译之后也是生成class文件
枚举也是一种引用数据类型
枚举中的每一个值都可以看作是常量
 */
enum Result {
    /*
    SUCCESS和FAIL是枚举Result类型中的一个值
    结果有两种情况的建议使用boolean，两种以上的建议使用枚举
     */
    SUCCESS, FAIL
}

//季节
enum Season {
    Spring, Summer, Autumn, Winter
}

//颜色
enum color {
    RED, BLUE, GREEN, YELLOW
}
