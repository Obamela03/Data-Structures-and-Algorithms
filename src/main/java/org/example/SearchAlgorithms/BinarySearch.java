package org.example.SearchAlgorithms;

public class BinarySearch
{
    public static int binarySearch(int [] array, int target){
        int low = 0, high = array.length - 1;
        for (int i = 0; i < array.length; i++){
            int mid = (low + high) / 2;
            if (mid == target) {
                System.out.println(target + " is found at index??");
                break;
            }else if (target < mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
    return -1; //NOT_FOUND = -1
    }

    public static void main(String [] args){
        int [] array = {1,2,3,8,5,6,7,9,10};
        binarySearch(array, 8);
    }
}
