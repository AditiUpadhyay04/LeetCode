package Sorting;

public class InsertionSort {

    public void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = x;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        InsertionSort s1 = new InsertionSort();
        s1.insertionSort(arr);
    }
}

