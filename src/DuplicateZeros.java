public class DuplicateZeros {
        public void duplicateZeros(int[] arr) {
            int totalZero = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0){
                    totalZero++;
                }
            }
            int i = arr.length - 1;
            int j = arr.length + totalZero - 1;

            while(i >= 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                if(arr[i] == 0){
                    j--;
                    if(j < arr.length){
                        arr[j] = 0;
                    }
                }
                i--;
                j--;

            }
        }

    public static void main(String[] args) {

    }
}

