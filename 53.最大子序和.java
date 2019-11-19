/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 *
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (47.64%)
 * Likes:    1357
 * Dislikes: 0
 * Total Accepted:    121.3K
 * Total Submissions: 252.4K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例:
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * 
 * 进阶:
 * 
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * 
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        // return getMax(nums, 0, nums.length);
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public int getMax(int[] nums,int start,int len){
        int max = nums[start];
        int mid = 0;
        for(int i = start + 1;i < len;i++){
            if(mid + max >= 0){
                if(nums[i] + mid > 0){
                    max += nums[i] + mid;
                    mid = 0;
                }else{
                    mid += nums[i];
                    if(mid > 0){
                        max += mid;
                        mid = 0;
                    }
                }
            }else{
                int tem = getMax(nums, i, len);
                if(tem > max){
                    return tem;
                }
            }
        }
        return max;
    }
}
// @lc code=end

