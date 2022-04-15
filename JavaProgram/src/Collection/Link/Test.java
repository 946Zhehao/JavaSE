package Collection.Link;
/*
实现单链表数据结构
 */
public class Test {
    public static void main(String[] args) {
        Link link = new Link();
        link.add1("You");
        link.add1("only");
        link.add1("once");
        link.add1("life");

        //寻找结点， 按下标
        Node node = link.find(3);
        System.out.println(node.getData() + " " + node.next);
        //寻找结点， 按数据域
        Node n1 = new Node("once", null);
        node = link.find(link.getHeader(), n1);
        System.out.println(node.getData() + " " + node.next);

        //删除结点， 按下标
        System.out.println(link.getSize());
        link.remove(4);
        System.out.println(link.getSize());

        //遍历
        link.traverse();
    }
}
