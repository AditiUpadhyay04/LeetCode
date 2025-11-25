public class OnePlus {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;      // done, no carry
            }
            digits[i] = 0;           // 9 turns to 0 and carry continues
        }

        // If all digits are 9, we need a new array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        OnePlus op = new OnePlus();

    }
}


