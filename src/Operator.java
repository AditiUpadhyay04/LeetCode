public class Operator {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                sum--;
            }
            else sum++;
        }
        return sum;

    }

    public static void main(String[] args) {


        Operator op = new Operator();

    }
}

