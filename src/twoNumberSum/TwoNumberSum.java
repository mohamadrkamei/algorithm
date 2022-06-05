package twoNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumberSum {

    public static void main(String[] args ) {

        int [] array = {3,2,4};
        System.out.println(twoNumberSum2(array,6));
    }


    public static int[] twoSumNumber(int[] nums , int  target){

        for (int i = 0; i < nums.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < nums.length; j++) {

                // Checking elements
                int temp = 0;
                if (nums[j] < nums[i]) {

                    // Swapping
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int left = 0;
        int right =nums.length-1;
        int sum = 0 ;
        int[] find ;

        while(sum != target){
            sum =  nums[left] + nums[right];
            if (sum < target){
                left++;
            }
            if (sum>target){
                right--;
            }
            if(sum == target){
                System.out.print("number 1  is " +  nums[left] + " and number 2 is " + nums[right]);
                find = new int[]{nums[left], nums[right]};
                return find;

            }
        }
        return null;
    }


    public static int[] twoNumberSum2(int[] array, int target){

        int sum = 0 ;
        int[] find ;
        for(int i=0 ; i<array.length ; i++){
            for (int j = i+1 ; j<array.length ; j++){
                sum = array[i]+ array[j];
                if (sum == target){
                    System.out.print("number 1  is " +  i + " and number 2 is " + j);
                    find = new int[]{i, j};
                    return find;
                }

            }

        }

        return null;
    }



}
