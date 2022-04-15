package Collection.Link;

public class Link {
    //头指针
    private Node header;
    //尾指针
    private Node tailer;
    //链表长度
    private int size;

    public Link() {

    }

    /**
     * 向链表中添加元素，通过尾指针采用尾插法
     */
    public void add1(String data) {
        //如果头指针为空，先创建一个结点，使头尾指针都指向该结点
        //否则通过尾指针进行插入
        if(header == null) {
            header = new Node(data, null);
            tailer = header;
        }else {
            //可以构建一个专门查找尾结点的方法
            Node node = new Node(data, null);
            tailer.next = node;
            tailer = node;
        }
        size++;
    }

    /**
     * 删除下标为index的结点
     * @param index
     */
    public void remove(int index) {
        /*
        如果结点不存在则退出，否则找到该节点的前驱结点，将其指针域修改为要删除结点的后继节点，同时size-1
         对头结点特殊处理，若要删除头结点，将头指针指向头结点的后继结点
         */
        if(null == find(index)) {
            System.out.println("该节点不存在！");
            return;
        } else if(index == 0) {
            header = find(1);
            size--;
        } else {
            Node node = find(index - 1);
            node.next = node.next.next;
            size--;
        }
    }

    /**
     * 返回下标为index的结点
     * @param index
     * @return Node
     */
    public Node find(int index) {
        //如果index值不合法返回null
        //否则从头结点开始寻找下标为index的结点并返回
        if(index < 0 || index >= size) {
            System.out.println("请输入正确的值！");
            return null;
        } else {
            Node node = header;
            while(index > 0) {
                index--;
                node = node.next;
            }
            return node;
        }
    }

    /**
     * 返回数据域与n的数据域相同的结点，采用递归
     * @param node
     * @return Node
     */
    public Node find(Node node, Node n) {
        if(n.equals(node)) {
            return node;
        }
        return find(node.next, n);
    }

    /**
     * 遍历链表
     */
    public void traverse() {
        Node node = header;
        while(null != node) {
            System.out.println(node.getData());
            node = node.next;
        }
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public Node getTailer() {
        return tailer;
    }

    public void setTailer(Node tailer) {
        this.tailer = tailer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
