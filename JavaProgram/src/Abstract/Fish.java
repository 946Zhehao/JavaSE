package Abstract;

public class Fish extends Animal{
    //行走
    @Override
    public void run() {
        System.out.println("鬼刀一开，看不见，走位走位！");
    }
    //吃
    @Override
    public void eat() {
        System.out.println("手里淦！");
    }

    //呼吸
    @Override
    public void breath() {
        System.out.println("难受,呵呵呵！");
    }

}
