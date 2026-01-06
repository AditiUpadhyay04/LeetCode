package Sorting;

public class SelectionSort {
        void selectionSort(int[] arr) {
            for(int i = 0; i < arr.length - 1; i++){
                int k = i;
                for(int j = i; j < arr.length; j++){
                    if(arr[j] < arr[k]){
                        k = j;
                    }
                }
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }

        }

    public static void main(String[] args) {
            int [] arr = {8,5,7,3,2};
            SelectionSort s1 = new SelectionSort();
            s1.selectionSort(arr);

    }
}

