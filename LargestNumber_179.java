/*
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
*/

class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for( int j=i+1; j<nums.length; j++){
                String ij = nums[i] + "" + nums[j];
                String ji = nums[j] + "" + nums[i];
                if (ji.compareTo(ij)>0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                else
                    continue;
            }
        }
        if (nums[0] == 0) {
            boolean allZero = true;
            for (int num : nums) {
                if (num != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) return "0";
        }
        StringBuilder result = new StringBuilder();
        for (int num : nums){
            result.append(num);
        }
        return result.toString();
    }
}
