/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 *
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (36.10%)
 * Likes:    1639
 * Dislikes: 0
 * Total Accepted:    102.7K
 * Total Submissions: 284.1K
 * Testcase Example:  '[1,3]\n[2]'
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 
 * 示例 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * 则中位数是 2.0
 * 
 * 
 * 示例 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * 则中位数是 (2 + 3)/2 = 2.5
 * 
 * 
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;
        int n = m / 2;
        int[] nums = new int[n+1];
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(k >= nums2.length || j < nums1.length && nums1[j] <= nums2[k] ){
                nums[i] = nums1[j];
                j++;
            }else if(k < nums2.length){
                nums[i] = nums2[k];
                k++;
            }
        }
        if((m)%2==0){
           return (nums[n] + nums[n-1]) * 1.0 / 2;
        } else{
            return nums[n];
        }
    }
}
// @lc code=end

