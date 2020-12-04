//Given an array nums containing n distinct numbers in the range [0, n], return 
//the only number in the range that is missing from the array. 
//
// Follow up: Could you implement a solution using only O(1) extra space complex
//ity and O(n) runtime complexity? 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range 
//[0,3]. 2 is the missing number in the range since it does not appear in nums.
// 
//
// Example 2: 
//
// 
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range 
//[0,2]. 2 is the missing number in the range since it does not appear in nums.
// 
//
// Example 3: 
//
// 
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range 
//[0,9]. 8 is the missing number in the range since it does not appear in nums.
// 
//
// Example 4: 
//
// 
//Input: nums = [0]
//Output: 1
//Explanation: n = 1 since there is 1 number, so all numbers are in the range [0
//,1]. 1 is the missing number in the range since it does not appear in nums.
// 
//
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 104 
// 0 <= nums[i] <= n 
// All the numbers of nums are unique. 
// 
// Related Topics 位运算 数组 数学 
// 👍 348 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        // 1.数学方法
//        int sum = 0;
//        int mid = nums.length / 2;
//        for(int num : nums)
//            sum += num;
//        if(nums.length % 2 == 0)
//            return (nums.length + 1) * mid - sum;
//        return (nums.length + 1) * mid + mid + 1 - sum;
        // 2.位运算
        int result = nums.length;
        for(int i=0; i < nums.length; i++) {
            result = i ^ result ^ nums[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
