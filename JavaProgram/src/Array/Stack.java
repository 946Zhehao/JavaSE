package Array;

public class Stack {
    private Object[] elements;
    private int index = -1;

    public Stack() {
        elements = new Object[10];
    }

    public Stack(int i) {
        elements = new Object[i];
    }

    public void push(Object obj) throws MyStackOperationException{
        //如果index指向下标位length的位置，说明栈满，则无法压栈
        if(index >= elements.length-1) {
            //System.out.println("栈已满，无法压栈！");
            throw new MyStackOperationException("栈已满，无法压栈！");
        } else {
            //将index指向的位置插入一个元素，index+1
            elements[++index] = obj;
        }
    }

    public Object pop() throws MyStackOperationException{
        //若index指向0，则说明栈空，无法弹栈
        if(index <= -1) {
            //System.out.println("栈已空，无法弹栈！");
            //return null;
            throw new MyStackOperationException("栈已空，无法弹栈！");
        } else {
            //将index指向的元素删除，index—1
            return elements[index--];
        }
    }

    //数组扩容
    public void addLength(int i) {
        Object[] obj = new Object[elements.length + i];
        System.arraycopy(elements, 0, obj, 0, elements.length);
        elements = obj;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return elements.length;
    }
}
