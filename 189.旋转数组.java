/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 *
 * https://leetcode-cn.com/problems/rotate-array/description/
 *
 * algorithms
 * Easy (38.89%)
 * Likes:    386
 * Dislikes: 0
 * Total Accepted:    72.4K
 * Total Submissions: 185.7K
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 
 * 
 * 示例 2:
 * 
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释: 
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 
 * 说明:
 * 
 * 
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 * 
 * 
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int temp = -1;
        if(nums.length <= 1 || 0 == k % nums.length ){
            return;
        }
        k = k % nums.length ;
        int n = nums.length % k == 0 ? k : (k%(nums.length%k)==0?nums.length%k:1);
        // for(int j = 0; j < k; j++){
        //     for(int i = nums.length - 1;i - 1 >= 0; i--){
        //         if(nums.length - 1 == i){
        //             temp = nums[i];
        //         }
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = temp;
        // }
        int j = 0;
        int m = 0;
        for(int i = 0; i < n; i++ ){
            j = i;
            while(true){
                m = j + k >= nums.length ? Math.abs(nums.length - j - k) : j + k;
                if(i != m){
                    if(i != j){
                        nums[m] = temp^nums[m];
                        temp = nums[m]^temp;
                        nums[m] = nums[m]^temp;
                    }else{
                        temp = nums[m]; 
                        nums[m] = nums[j];
                    }
                    j = m;
                }else{
                    nums[i] = temp;
                    break;
                }
            }
        }
    }
}
// @lc code=end

