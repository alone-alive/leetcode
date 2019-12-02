/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 *
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/description/
 *
 * algorithms
 * Medium (39.90%)
 * Likes:    152
 * Dislikes: 0
 * Total Accepted:    20.8K
 * Total Submissions: 51.7K
 * Testcase Example:  '7\n[2,3,1,2,4,3]'
 *
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 * 
 * 示例: 
 * 
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 
 * 
 * 进阶:
 * 
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * 
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min = 0;
        int sum = 0;
        int l = 0,r = 0;
        while(r>=l){
            if(sum >= s ){
                if(min == 0 || min > r - l){
                    min = r - l;
                }else{
                    sum = sum - nums[l];
                    l++;
                }
            }else{
                if(r >= nums.length && sum < s){
                    break;
                }
                sum = sum + nums[r];
                r++;
            }
        }
        return min;
    }
}
// @lc code=end

