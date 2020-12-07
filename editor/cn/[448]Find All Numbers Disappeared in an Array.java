//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elemen
//ts appear twice and others appear once. 
//
// Find all the elements of [1, n] inclusive that do not appear in this array. 
//
// Could you do it without extra space and in O(n) runtime? You may assume the r
//eturned list does not count as extra space. 
//
// Example:
// 
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]
// 
// Related Topics 数组 
// 👍 508 👎 0


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 使用额外数组
//        List<Integer> result = new ArrayList<>();
//        int[] count = new int[nums.length];
//        for (int num : nums) count[num - 1]++;
//        for (int i = 0; i < count.length; i++) if (count[i] == 0) result.add(i + 1);
//        return result;
        // 不使用额外数组
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for(int num : nums) {
            index = Math.abs(num) - 1;
            if(nums[index] > 0)
            nums[index] = nums[index] * -1;
        }
        for (int i = 0; i < nums.length; i++) if (nums[i] >= 0) result.add(i + 1);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
