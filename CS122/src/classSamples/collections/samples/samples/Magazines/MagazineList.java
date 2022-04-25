package classSamples.collections.samples.Magazines;


public class MagazineList {
    MagazineNode list;

    public MagazineList(){
        list = null;
    }

    public void add(Magazine mag) {
        MagazineNode node = new MagazineNode(mag);
        if(this.list==null){
            this.list = node;
        } else {
            MagazineNode current = list;
//            current.next == null
//            move it to next node until next variable is null
            while(current.next != null)
                current = current.next;

            current.next = node;
        }
    }

    public void addToFront(Magazine mag){
        MagazineNode node = new MagazineNode(mag);
        if(this.list == null) {
            this.list = node;
        } else{
            node.next = this.list;
            this.list = node;
        }
    }

    public Magazine removeFront(){
        MagazineNode current = this.list;
        if(this.list == null){
            return null;
        }
        else if(this.list.next == null){
            Magazine m = this.list.m;
            this.list = null;
            return m;
        }
        else{
            this.list = current.next;
            Magazine m = current.m;
            current.next = null;
            return m;
        }
    }

    public Magazine removeEnd(){
        MagazineNode current = list;
        if(this.list == null){
            return null;
        } else if(this.list.next == null){
            Magazine m = this.list.m;
            this.list = null;
            return m;
        }else {
            while(current.next.next != null){
                current = current.next;
            }
            Magazine m = current.next.m;
            current.next = null;
            return m;
        }
    }





//    list.next = newNode
//
//    class Node{
//        int i;
//        Node next;
//    }

    class MagazineNode{
        public Magazine m;
        public MagazineNode next;

        public MagazineNode(Magazine m){
            this.m = m;
            this.next = null;
        }
    }
}

