package Staticx;

public class StaticX {
    public static void main(String[] args) {
        Chinese c1 = new Chinese(100044, "起飞");
        Chinese c2 = new Chinese(100055, "芜湖");
        Chinese c3 = new Chinese(100066, "奈斯");

        System.out.println(c1.getId() + "-" + c1.getName() + "-" + Chinese.getCountry());
        System.out.println(c2.getId() + "-" + c2.getName() + "-" + c2.getCountry());
        System.out.println(c3.getId() + "-" + c3.getName() + "-" + c3.getCountry());

        American a1 = new American(200011, "Trump");
        American a2 = new American(200022, "Baideng");
        American a3 = new American(200033, "Aobama");

        System.out.println(a1.getId() + "-" + a1.getName() + "-" + American.getCountry());
        System.out.println(a2.getId() + "-" + a2.getName() + "-" + a2.getCountry());
        System.out.println(a3.getId() + "-" + a3.getName() + "-" + a3.getCountry());

        //静态代码块
        //StaticZz sZ = new StaticZz();
    }
}
