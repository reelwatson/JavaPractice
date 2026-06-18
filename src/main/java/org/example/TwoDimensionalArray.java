public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray newArray = new TwoDimensionalArray();
        newArray.stringArrayExample();
    }

    public void stringArrayExample() {
        String[] ladies = {"Jessica", "Mohiam", "Chani", "Alia", "Irulan"};
        String[] titles = {"Lady", "Reverend Mother", "Wife"};
        String[] relationships = {"Mother", "Grandmother", "Sister", "Beloved", "Repentant"};

        String[][] womenOfDune = {ladies, titles, relationships};

        for(String[] women : womenOfDune) {
            for (String woman : women) {
                System.out.print(woman + " ");
            }
            System.out.println();
        }
    }
}
