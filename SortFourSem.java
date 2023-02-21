import java.util.logging.*;

public class SortFourSem {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, i);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        SortFourSem ob = new SortFourSem();
        ob.sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
        Logger logger = Logger.getLogger(SortFourSem.class.getName());
        logger.setLevel(Level.INFO);
        logger.info("Length " + arr.length);
        logger.info("First: " + arr[0]);
        logger.info("Second: " + arr[1]);
        logger.info("Third: " + arr[2]);
        logger.info("Fourth: " + arr[3]);
        logger.info("Fifth: " + arr[4]);
        logger.info("Sixth: " + arr[5]);
    }
}
