//Calculate the sum of two integers a and b, but you are not allowed to use the 
//operator + and -. 
//
// 
// Example 1: 
//
// 
//Input: a = 1, b = 2
//Output: 3
// 
//
// 
// Example 2: 
//
// 
//Input: a = -2, b = 3
//Output: 1
// 
// 
// 
// Related Topics 位运算 
// 👍 338 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getSum(int a, int b) {
        if ((a & b) == 0)
            return a ^ b;
        return getSum(a ^ b,(a & b) << 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
