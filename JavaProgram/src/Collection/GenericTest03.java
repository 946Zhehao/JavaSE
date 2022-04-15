package Collection;
/*
自定义泛型
自定义泛型时，<>中是一个标识符，随便写
 */
public class GenericTest03<sadjknxaksn> {
    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("wdax");
        String str = gt.get();
        System.out.println(str);
    }

    public void doSome(sadjknxaksn o) {
        System.out.println(o);
    }

    public sadjknxaksn get() {
        return null;
    }
}
