public class SleepBetweenEachSecond {
    public static void main(String[] args) throws InterruptedException {

        int start = 10;

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Liftoff! We have liftoff!!");
        Thread.sleep(3000);
        System.out.println("Artemis VIII is headed to Mars!");
        Thread.sleep(3000);
    }
}
