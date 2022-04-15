package Date;
import java.text.DecimalFormat;

public class Test04 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的
        //DecimalFormat df = new DecimalFormat("数字格式");
        /*
        # 代表任意数字
        ，代表千分位
        . 代表小数点
        0 代表不够时补零
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56123);
        System.out.println(s);      //1,234.56
        //0000代表保留4位小数，不够时补零
        df = new DecimalFormat("###,###.0000");
        s = df.format(1234.56);
        System.out.println(s);      //1,234.5600
    }
}
