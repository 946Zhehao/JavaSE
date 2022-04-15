package Abstract;

//抽象类不可实例化
//抽象类不一定都是没有实现的方法（抽象方法）
//但含有抽象方法的一定是抽象类

public abstract class Animal {
    //动作
    public void run(){
        System.out.println("动物在行走！");
    }
    //吃
    public void eat(){
        System.out.println("动物在吃饭！");
    }

    //呼吸  抽象方法
    public abstract void breath();

}
