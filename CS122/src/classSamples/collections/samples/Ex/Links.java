package classSamples.collections.samples.Ex;

public class Links {
    public static void main(String[] args) {
        Node list = new Node(1);
        Node b = new Node(2);
        list.next = b;
        Node c = new Node(3);
        b.next = c;
        Node d = new Node(4);
        c.next = d;
        b= null;c=null;d=null;
        System.out.println("done");
        Node current = list;
        while(current.next != null){
            current = current.next;
            System.out.println(current.info + "->");
        }
    }
    
    
}


