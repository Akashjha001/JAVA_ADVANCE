public class BinarySearch{
    public static int BinarySearch(int nums[],int key) {
        int start = 0; int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparision

            if(nums[mid]==key){   //found
                return mid;
            }
            if(nums[mid]<key){    //right
                start = mid+1;
            }
            else{                 //left
                end=mid-1;                                 
            }
        }
        return-1;
    }
    public static void main(String args[]){
        int nums[]={2, 4, 6, 8, 10, 12, 14, 16};
        int key = 16;
        System.out.println("index of key is: " + BinarySearch(nums,key));
    }
}