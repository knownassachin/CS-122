package classSamples.collections.samples.Magazine10;

public class MagazineList {
    MagazineNode list;

    public MagazineList(){
        this.list = null;
    }

    public void add(Magazine mag){
        MagazineNode m = new MagazineNode(mag);
        if(this.list == null)
            this.list = m;
        else{
            MagazineNode current = list;
            while(current.next != null){
                current = current.next;
            }
            current.next = m;
        }

    }

    public void addToFront(Magazine mag){
        MagazineNode m = new MagazineNode(mag);
        m.next = this.list;
        this.list = m;
    }

    public void removeLast(){
        //make it return the item you just removed
        MagazineNode current = this.list;
        if(this.list.next == null){
            this.list = null;
        }
        while(current.next.next != null){
           current = current.next;
        }
        current.next = null;
    }

    public void removeFirst(){
        if(this.list.next == null){
            this.list = null;
        }
        MagazineNode current = list;
        this.list = this.list.next;
        current.next = null;
    }

    public void remove(Magazine m){

    }

    public void addToIndex(Magazine m, int index){

    }

    public String toString() {
        MagazineNode current = this.list;
        String result = "";
        while(current != null){
            result += current.mag.toString() + "->";
            current = current.next;
        }
        return result + "null";
    }

    class MagazineNode{
        Magazine mag;
        MagazineNode next;

        public MagazineNode(Magazine mag){
            this.mag = mag;
            this.next = null;
        }
    }
}
