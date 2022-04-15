package Paint;

public class Human {
    public static void main(String[] args){
        Student st = new Student();
        st.name = "张三";
        st.num = 2000140;
        Computer ct = new Computer();
        ct.color = "黄色";
        ct.pinPai = "芜湖";
        ct.xingHao = "QiFei-11";
        st.cp = ct;
    }
}
