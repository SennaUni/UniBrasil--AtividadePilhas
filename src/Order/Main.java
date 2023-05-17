package Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Bubble Sort =========");
        BubbleSort testeBubble = new BubbleSort();
        testeBubble.execute();

        System.out.println("\n");

        System.out.println("========= Selection Sort =========");
        SelectionSort testeSelection = new SelectionSort();
        testeSelection.execute();
    }
}
