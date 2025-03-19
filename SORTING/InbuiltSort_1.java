import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort_1{
    public static void PrintArr(Integer arr[]) {
        for (Integer arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {3, 4, 1, 5, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        PrintArr(arr);
    }
}
/*
Time Complexity is :
so TC is = O(nlogn)
*/