public class PrefixSum{
    public static void maxSubArraySum(int numbers[]) {
        int currSum ;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //Calculate Prefix
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("MAX SUM: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }  
}
/*
Time Complexity of Brute Force is :
Because of 2 nested loop is used
so TC is = O(n^2)
*/