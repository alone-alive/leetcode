/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (45.51%)
 * Likes:    344
 * Dislikes: 0
 * Total Accepted:    84.5K
 * Total Submissions: 184.5K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 说明:
 * 
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 
 * 示例:
 * 
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        for(int i = 0;i<m;i++){
            nums[i] = nums1[i];
        }
        int count1 = 0,count2 = 0;
        for(int j = 0; j < m+n;j++){
            if(count1<m&&count2<n){
                if(nums[count1]>nums2[count2]){
                    nums1[j] = nums2[count2];
                    count2++;
                }else{
                    nums1[j] = nums[count1];
                    count1++;
                }
            }else if(count2 >= n){
                nums1[j] = nums[count1];
                count1++;
            }else{
                nums1[j] = nums2[count2];
                count2++;
            }
        }
    }
}
// @lc code=end

