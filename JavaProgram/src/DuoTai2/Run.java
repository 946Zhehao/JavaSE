package DuoTai2;

public class Run {
    public static void main(String[] args) {
        //创建主人对象
        Monster m = new Monster();
        //创建宠物对象
        Pet p1 = new Cat();
        Pet p2 = new Dog();

        //主人喂宠物
        m.feed(p1);     //m.feed(new Cat());
        m.feed(p2);     //m.feed(new Dog());
    }
}
