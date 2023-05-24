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

        System.out.println("\n");

        System.out.println("========= Insertion Sort =========");
        InsertSearch insertSearch = new InsertSearch();
        insertSearch.execute();

        System.out.println("\n");

        System.out.println("========= Merge Sort =========");
        MergeSort mergeSort = new MergeSort();
        mergeSort.execute();
    }
}
