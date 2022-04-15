package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5.0之后推出的增强for循环 foreach
 */
public class ForeachTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 55, 99};

        //foreach
        //data就是数组中的元素
        //缺点，没有下标
        for (int data : arr) {
            System.out.println(data);
        }

        //----------------------------------------------
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("xxxx");
        list.add("aaaa");
        //foreach
        for(String s : list) {
            System.out.println(s);
        }
    }
}
