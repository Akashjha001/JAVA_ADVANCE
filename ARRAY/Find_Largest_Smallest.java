public class Find_Largest_Smallest{
    public static int GetLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE;//-infinity
        int Smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0; i<numbers.length; i++){
            if(Largest<numbers[i]){
                Largest = numbers[i];
            }
            if(Smallest>numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("The Smallest value is: " + Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[]= {1, 2, 6, 3, 5};
        System.err.println("The Largest value is: " + GetLargest(numbers));
    }
}