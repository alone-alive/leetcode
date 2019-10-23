import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 *
 * https://leetcode-cn.com/problems/single-number/description/
 *
 * algorithms
 * Easy (63.71%)
 * Likes:    876
 * Dislikes: 0
 * Total Accepted:    111.3K
 * Total Submissions: 174.5K
 * Testcase Example:  '[2,2,1]'
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 说明：
 * 
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 
 * 示例 1:
 * 
 * 输入: [2,2,1]
 * 输出: 1
 * 
 * 
 * 示例 2:
 * 
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // boolean flag = true;
        // int i;
        // for(i = 0;i < nums.length;i++){
        //     for(int j = 0;j < nums.length;j++){
        //         if(i != j && nums[i]==nums[j]){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         return nums[i];
        //     }
        //     flag = true;
        // }
        // return nums[i];
        // Arrays.sort(nums);
        // int i = 0;
        // for(i = 0;i < nums.length - 1;i+=2){
        //     if(nums[i]!=nums[i+1]){
        //         break;
        //     }
        // }
        // return nums[i];
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n ^= nums[i];
        }
        return n;
    }
}
// @lc code=end

