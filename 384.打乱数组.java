import java.util.Arrays;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=384 lang=java
 *
 * [384] 打乱数组
 *
 * https://leetcode-cn.com/problems/shuffle-an-array/description/
 *
 * algorithms
 * Medium (47.79%)
 * Likes:    38
 * Dislikes: 0
 * Total Accepted:    11.9K
 * Total Submissions: 24.7K
 * Testcase Example:  '["Solution","shuffle","reset","shuffle"]\n[[[1,2,3]],[],[],[]]'
 *
 * 打乱一个没有重复元素的数组。
 * 
 * 示例:
 * 
 * 
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * 
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 * 
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 * 
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * 
 * 
 */

// @lc code=start
class Solution {
    private int[] arr;
    private int[] copy;

    public Solution(int[] nums) {
        arr = nums;
        copy = Arrays.copyOf(nums, nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return Arrays.copyOf(copy, copy.length);
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int tmp = 0;
        Random r = new Random();
        for(int k = 0;k<arr.length;k++){
            int ra = r.nextInt(arr.length - k);
            tmp = arr[k];
            arr[k] = arr[k+ra];
            arr[k+ra] = tmp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end

