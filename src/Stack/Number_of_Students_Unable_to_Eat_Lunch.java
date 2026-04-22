package Stack;

public class Number_of_Students_Unable_to_Eat_Lunch {
        public int countStudents(int[] students, int[] sandwiches) {
            int count = 0;
            int count1 = 0;
            int n = students.length;
            int m = sandwiches.length;

            for(int i = 0; i < n; i++) {
                if(students[i] == 0){
                    count++;
                }
                else
                {
                    count1++;
                }
            }
            for(int i = 0; i < m; i++) {
                if(sandwiches[i] == 0) {
                    if(count > 0){
                        count--;
                    }
                    else break;
                }
                else
                {
                    if(count1 > 0) count1--;
                    else break;
                }
            }
            int ans = count + count1;

            return ans;
        }

    public static void main(String[] args) {

    }
}

