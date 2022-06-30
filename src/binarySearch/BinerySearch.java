package binarySearch;

import java.util.Arrays;

public class BinerySearch {

    public static void main(String[] args ) {

        int [] array = {-1,0,2,4,5,6};
        int i = binarySearch(array, -1);
        System.out.print(i);
    }
    public static int binarySearch(int[] array, int target){

        int first= 0;
        int last = array.length -1 ;
        int mid = (last + first) /2 ;

        while (last >= first){

            if (array[mid] == target){
                return mid;
            }
            if (array[mid] > target)
            {
                last = mid -1;
            }
            if(array[mid] <target)
            {
                first=mid+1;
            }
            mid = (first + last ) /2  ;
        }
        if(first>last){
            return -1;
        }
        return mid;
    }
}
