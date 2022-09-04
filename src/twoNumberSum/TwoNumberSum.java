package twoNumberSum;

import java.util.*;

public class TwoNumberSum {

    public static void main(String[] args) {

        int[] array = {-1,-1,0,1,1,-1};
        System.out.println(pivotIndex(array));
    }


    public static int[] twoSumNumber(int[] nums, int target) {

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
        int right = nums.length - 1;
        int sum = 0;
        int[] find;

        while (sum != target) {
            sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            }
            if (sum > target) {
                right--;
            }
            if (sum == target) {
                System.out.print("number 1  is " + nums[left] + " and number 2 is " + nums[right]);
                find = new int[]{nums[left], nums[right]};
                return find;

            }
        }
        return null;
    }


    public static int[] twoNumberSum2(int[] array, int target) {

        int sum = 0;
        int[] find;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = array[i] + array[j];
                if (sum == target) {
                    System.out.print("number 1  is " + i + " and number 2 is " + j);
                    find = new int[]{i, j};
                    return find;
                }

            }

        }

        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer requierdNumb = target - nums[i];
            if (indexMap.containsKey(requierdNumb)) {
                int toReturn[] = {indexMap.get(requierdNumb), i};
                return toReturn;
            }
            indexMap.put(nums[i], i);
        }

        return null;

    }


//    Given an array of integers nums, calculate the pivot index of this array.
//
//    The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//
//    If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//
//    Return the leftmost pivot index. If no such index exists, return -1.
//    Example 1:
//
//    Input: nums = [1,7,3,6,5,6]
//    Output: 3
//    Explanation:
//    The pivot index is 3.
//    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//    Right sum = nums[4] + nums[5] = 5 + 6 = 11
//    Example 2:
//
//    Input: nums = [1,2,3]
//    Output: -1
//    Explanation:
//    There is no index that satisfies the conditions in the problem statement.
//    Example 3:
//
//    Input: nums = [2,1,-1]
//    Output: 0
//    Explanation:
//    The pivot index is 0.
//    Left sum = 0 (no elements to the left of index 0)
//    Right sum = nums[1] + nums[2] = 1 + -1 = 0
    public static int pivotIndex(int[] nums) {

        int pivot = -1;
        int sumLeft = 0;
        int sumRight = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;

        }
        sumRight = sum - nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && sumRight == 0) {
                pivot = 0;
                return pivot;
            } if (i>0){
                sumLeft = sumLeft + nums[i-1];
                sumRight = sumRight - nums[i];
                if (sumLeft == sumRight){
                    pivot = i;
                    return pivot;
                }
            }
        }
        return pivot;
    }

    public int[] runningSum(int[] nums) {
        int temp = nums[0];
        int runningSum[] = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = temp + nums[i];
            temp = runningSum[i];
        }
        Arrays.asList(runningSum).indexOf(5);
        return runningSum;
    }


}
