package Date;
import java.math.BigDecimal;
/*
BigDecimal 属于大数据，精度极高，不属于基本数据类型，属于java对象，专门用在财务软件当中
财务软件中double是不够的
 */
public class Test05 {
    public static void main(String[] args) {
        //精度极高的100
        BigDecimal bd = new BigDecimal(100);
        //精度极高的200
        BigDecimal bd2 = new BigDecimal(200);
        //求和
        BigDecimal value = bd.add(bd2);
        System.out.println(value);
        //所有运算都要调用方法，不能像基本数据类型那样使用
    }
}
