package Integer;
/*
这种包装类不需要自己写，sun公司已给出

 */
public class MyInt {
    private int value;

    public MyInt() {

    }

    public MyInt(int value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
