package classSamples.collections.samples.Magazine10;

public class MagazineListDriver {
    public static void main(String[] args) {
        MagazineList magList = new MagazineList();
        magList.addToFront(new Magazine("ABCD"));
        magList.add(new Magazine("EFGH"));
        magList.addToFront(new Magazine("IJKL"));
        System.out.println(magList);
    }
}
