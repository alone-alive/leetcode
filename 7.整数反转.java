/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (33.10%)
 * Likes:    1383
 * Dislikes: 0
 * Total Accepted:    201.3K
 * Total Submissions: 607.7K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        String num = Integer.toString(Math.abs(x));
        StringBuilder opnum = new StringBuilder(num);
        opnum = opnum.reverse();
        // for (int i = num.length() -1; i >= 0; i--){
        //     opnum.append(num.charAt(i));
        // }
        int xx = 0;
        try{
            xx = Integer.parseInt(opnum.toString());
        } catch (Exception e){
            return 0;
        }
        if (x < 0){
            return -xx;
        }
        return xx;
    }
}
// @lc code=end

