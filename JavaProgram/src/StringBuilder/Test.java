package StringBuilder;
/*
StringBuffer和StringBuilder的区别
    StringBuffer中的方法都有：synchronized关键字修饰，表示StringBuffer在多线程环境下运行是安全的
    StringBuilder中的方法都没有：synchronized关键字修饰，表示StringBuilder在多线程环境下运行是不安全的
    如果使用的只有局部变量，建议使用StringBuilder，因为局部变量必不共享，不需要考虑线程安全问题，
    若使用StringBuffer，由于是线程安全的，会导致效率降低

 */
public class Test {
    public static void main(String[] args) {
        //创建一个初始化容量为16个byte[]数组
        StringBuilder stringBuilder = new StringBuilder();
        //拼接字符串，同意调用append()方法
        stringBuilder.append(3);
        stringBuilder.append(3.14);
        stringBuilder.append(300L);
        stringBuilder.append('a');
        stringBuilder.append("hello");
        stringBuilder.append(new Test());
        //append()追加时，若byte数组满了，会自动扩容
        System.out.println(stringBuilder);
    }
}
