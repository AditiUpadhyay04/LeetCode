class Solution {
    public int getSecondLargest(int[] arr) {
        int num1 = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = -1;

        for (int i = 0; i < num1; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] != max && arr[i] > secMax) {
                secMax = arr[i];
            }

        }
        return secMax;


    }

    public static void main(String[] args) {
        Solution s1 = new Solution();

    }
}

