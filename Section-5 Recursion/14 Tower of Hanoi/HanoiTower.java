public class HanoiTower {
    public static void hanoiTower(int disks, String source, String auxiliary, String destination)
    {
        if(disks>0)
        {
            hanoiTower(disks-1, source, destination, auxiliary);
            System.out.printf("Move 1 disk from tower %s to tower %s\n", source, destination);
            hanoiTower(disks-1, auxiliary, source, destination);
        }
    }

    public static void main(String[] args) {
        hanoiTower(3, "1", "2", "3");
    }
}
