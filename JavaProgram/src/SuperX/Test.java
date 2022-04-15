package SuperX;
/*
* super能出现在实例方法和构造方法中
* super的语法：super.   super()
* super不能使用在静态方法中
* super大部分情况下可以省略
* super()只能出现在构造方法第一行，通过当前的构造方法去调用”父类“的构造方法，
* 目的是：创建子类对象的时候，先初始化父类型特征
* 当一个构造方法第一行：既没有this(),有没有super(),默认有一个super()，有了其中一个就不会有另外一个。
* 一个类中所有的构造方法，若都没有this()或super(),都会默认有一个super()
* 表示通过当前子类的构造方法调用父类的无参构造方法，所以必须保证父类的无参构造方法必须存在
* this()和super()不能共存，有this()就没有super()
 */
public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat();
    }
}
