//
//Given an integer, write an algorithm to convert it to hexadecimal. For negativ
//e integer, two’s complement method is used.
// 
//
// Note:
// 
// All letters in hexadecimal (a-f) must be in lowercase. 
// The hexadecimal string must not contain extra leading 0s. If the number is ze
//ro, it is represented by a single zero character '0'; otherwise, the first chara
//cter in the hexadecimal string will not be the zero character. 
// The given number is guaranteed to fit within the range of a 32-bit signed int
//eger. 
// You must not use any method provided by the library which converts/formats th
//e number to hex directly. 
// 
// 
//
// Example 1:
// 
//Input:
//26
//
//Output:
//"1a"
// 
// 
//
// Example 2:
// 
//Input:
//-1
//
//Output:
//"ffffffff"
// 
// Related Topics 位运算 
// 👍 112 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder("");
        if(num == 0) return "0";
        int res = 0;
        int cap = ~(( 1 << 28) - 1);
        int i = 0;
        boolean first = true;
        while(i < 8) {
            res = (num & (cap >>> 4*i)) >>> (28 - 4 * i);
            i++;
            if(first && res == 0) {
                continue;
            }
            first = false;
            if( res >= 10)
                sb.append((char)(res - 10 + 'a'));
            if(res < 10 )
                sb.append(res);

        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
