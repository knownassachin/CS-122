package classSamples.collections.samples.Ex;

public class LinksRef {
    public static void main(String[] args) {
        Node list = new Node(1);
        Node two = new Node(2);
        list.next = two;
        Node three = new Node(3);
        two.next = three;
        two = null;three = null;
        Node newNode = new Node(123);

        newNode.next = list;
        Node current = list;// temporary
        while(current.next != null){
            current = current.next;
        }

    }
}

class Node{
    int info;
    Node next;

    public Node(int i){
        this.info = i;
        this.next = null;
    }
}













