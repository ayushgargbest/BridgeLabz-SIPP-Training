import java.util.*;

public class SortComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void mergeSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] data = new int[10000];
        for (int i = 0; i < data.length; i++) data[i] = 10000 - i;
        bubbleSort(data.clone());
        mergeSort(data.clone());
        quickSort(data.clone());
        System.out.println("Sorting completed.");
    }
}