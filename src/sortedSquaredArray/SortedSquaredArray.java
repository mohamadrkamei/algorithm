package sortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args ) {

        int [] array = {2};
       int [] sortsquare = sortedSquared(array);

        for (int sq: sortsquare) {
            System.out.print(sq+" ");
        }
    }

    public static int[] sortedSquared(int[] nums ){

        Arrays.sort(nums);
        int[] squaredArray = new int[nums.length];
        int start =0;
        int end = nums.length-1;
        int endsq = nums.length-1;


        while (start <= end){
            if (nums[start] * nums[start] >= nums[end] * nums[end]){
                squaredArray[endsq] = nums[start] * nums[start];
                start += 1;
                endsq--;
            }else {
                squaredArray[endsq] = nums[end] * nums[end];
                end -= 1;
                endsq--;
            }
        }


        return squaredArray;
    }
}
