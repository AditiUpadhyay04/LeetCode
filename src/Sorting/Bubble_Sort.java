package Sorting;
class Bubble_Sort {
    public void bubbleSort(int[] arr) {
        int flag ;
        int n = arr.length;
        for ( int i = 0; i < n -1; i++){
            flag = 0;
            for(int j = 0; j < n - 1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        Bubble_Sort B1 = new Bubble_Sort();
        B1.bubbleSort(arr);
    }
}


