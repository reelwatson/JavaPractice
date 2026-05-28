public class SkipThirteenthFloor {
    public static void main(String[] args) throws InterruptedException {
        twilightZoneEffect();
        for (int i = 1; i < 21; i++) {
            if (i == 13) {
                continue;
            }
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
    public static void twilightZoneEffect() throws InterruptedException {
        for (int i = 1; i < 21; i++) {
            if (i == 13) {
                System.out.println("Uh oh, something went wrong with the elevator!");
                Thread.sleep(5000);
                break;
            }
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
