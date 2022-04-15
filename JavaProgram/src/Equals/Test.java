package Equals;
/*
* equals的源代码：
*       public boolean equals(Object obj)
*           return (this == obj);
* JAVA 中所有基本数据类型用 == 判断是否相等
*        所有引用数据类型用equals()方法判断是否相等
*       String 类型使用equals()
 */
public class Test {
    public static void main(String[] args){
        Token t1 = new Token(18, 120, 180);
        Token t2 = new Token(18, 120, 180);
        Token t3 = new Token(20, 130, 178);

        //若不重写equals()默认比较地址是否相等
        //System.out.println(t1.equals(t2));

        //此语句也是比较t1和t2中保存的内存地址是否相等
        System.out.println(t1 == t2);   //false

        System.out.println(t1.equals(t2));  //true
        System.out.println(t1.equals(t3));  //false


        String str1 = new String("123");
        String str2 = new String("123");
        String str3 = "123";
        String str4 = "123";
        //new 出来的String 类型必须使用equals
        System.out.println(str1 == str2);   //false
        //直接赋值字符串可以使用 ==
        System.out.println(str3 == str4);   //true
        // 所有 String 类型都用equals()方法判断，因为不知道是以哪种方式创建的
        System.out.println(str1 == str3);   //false

    }
}
