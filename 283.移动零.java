/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 *
 * https://leetcode-cn.com/problems/move-zeroes/description/
 *
 * algorithms
 * Easy (57.00%)
 * Likes:    414
 * Dislikes: 0
 * Total Accepted:    76.2K
 * Total Submissions: 133.2K
 * Testcase Example:  '[0,1,0,3,12]'
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 示例:
 * 
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 说明:
 * 
 * 
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * 
 * 
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j = 1;
        while(i<j&&i<nums.length&&j<nums.length){
            if(nums[i]==0&&nums[j]!=0){
                nums[i] = nums[j];
                nums[j] = 0;
                i += 1;
                j += 1;
            }else if(nums[i]!=0&&nums[j]==0){
                i += 1;
                j += 1;
            }else if(nums[i]==0&&nums[j]==0){
                j += 1;
            }else {
                i += 2;
                j += 2;
            }
        }
    }
}
// @lc code=end

