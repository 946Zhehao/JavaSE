package DuoTai;

/*
* 面向对象三大特征:封装，继承，多态，
* 多态涉及的几个概念：
*       向上转型（upcasting）
*           子类型-->父类型（自动转型）
*       向下转型（downcasting）
*           父类型-->子类型（强制类型转换）
*       无论向上还是向下转型，都必须存在继承关系
 */
public class DuoTaiTest {
    public static void main(String[] args){
        //向上转型
        //编译看左，运行看右
        //父类引用指向子类对象时
        //只能调用父类中定义的方法，子类中特有的方法不可以（向下转型可以）
        Animal a1 = new Bird();
        a1.move();
        Animal a2 = new Cat();
        a2.move();

        Animal a3 = new Animal();
        a3.move();

        //向下转型
        //将父类引用指向子类对象的引用，强制转换为子类引用，从而调用子类特有的方法
        //向下转型可能会出现java.lang.ClassCastException错误 例如↓↓↓
        //Cat c2 = (Cat) a1;
        //原因是父类引用指向的并不是Cat类型的对象，而是与Cat无关的Bird类型的对象
        //为了避免这种情况，需要使用 instanceof 来判断父类引用是否指向所需要的对象
        //若是，再进行向下转型
        if(a1 instanceof Cat){
            Cat c1 = (Cat)a1;
            c1.catchMouse();
        }
        if(a1 instanceof Bird){
            Bird b2 = (Bird)a1;
            b2.sting();
        }

    }
}
