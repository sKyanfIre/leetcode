//Given an array of integers nums which is sorted in ascending order, and an int
//eger target, write a function to search target in nums. If target exists, then r
//eturn its index. Otherwise, return -1. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// -9999 <= nums[i], target <= 9999 
// All the integers in nums are unique. 
// nums is sorted in an ascending order. 
// 
// Related Topics 二分查找 
// 👍 229 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
//        return searchArray(nums, 0, nums.length - 1, target);
        return search2(nums, target);
    }

    public int searchArray(int[] nums, int start, int end, int target) {
        if (start >= end) {
            if (nums[end] == target) {
                return end;
            }
            return -1;
        }
        int mid = (start + end + 1) / 2;
        if (nums[mid] == target) {

            return mid;
        } else if (nums[mid] < target) {

            return searchArray(nums, mid + 1, end, target);
        } else {

            return searchArray(nums, start, mid - 1, target);
        }

    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = ++mid;

            } else  {
                right = --mid;
            }
        }
        return -1;
    }
}
