package classSamples.collections.samples.Magazines;

public class MagazineListDriver {
    public static void main(String[] args) {
        MagazineList magList = new MagazineList();
        magList.add(new Magazine("ABCD"));
        magList.add(new Magazine("EFGH"));
        magList.addToFront(new Magazine("IJKL"));
    }
}
