import java.util.Arrays;
public class InbuiltSort{
    public static void PrintArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        PrintArr(arr);
        int pro[] = {3, 5, 4, 6, 6};
        Arrays.sort(pro, 1, 3);
        PrintArr(pro);
    }
}
/*
Time Complexity is :
so TC is = O(nlogn)
*/

