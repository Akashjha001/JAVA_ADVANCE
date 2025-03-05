public class BruteForce{
    public static void max_SubArray_sum(int numbers[]) {
        int curr_Sum ;
        int max_Sum = Integer.MIN_VALUE ;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                curr_Sum = 0;
                for(int k=start; k<=end; k++){
                    curr_Sum += numbers[k];
                }
                System.out.println(curr_Sum);
                if(max_Sum < curr_Sum){
                    max_Sum = curr_Sum;
                }
            }
        }
        System.out.println("MAX SUM: " + max_Sum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        max_SubArray_sum(numbers);
    }    
}
/*
Time Complexity of Brute Force is :
Because of 3 nested loop is used
so TC is = O(n^3)
*/