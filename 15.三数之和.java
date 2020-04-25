import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 *
 * https://leetcode-cn.com/problems/3sum/description/
 *
 * algorithms
 * Medium (24.10%)
 * Likes:    1579
 * Dislikes: 0
 * Total Accepted:    126K
 * Total Submissions: 511.9K
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * ？找出所有满足条件且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 
 * 满足要求的三元组集合为：
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int k = 0;k<nums.length-2;k++) {
            if (nums[k] > 0) {
                break;
            }
            if(k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
            // for(int j = i + 1;j<nums.length;j++) {
            //     b = nums[j];
            //     for(int k = nums.length - 1;k>=j + 1;k--) {
            //         c = nums[k];
            //         if ((c > 0 && a > 0) || (c < 0 && a < 0)) {
            //             break;
            //         }
            //         if(a+b+c < 0) {
            //             break;
            //         }
            //         if(a+b+c==0) {
            //             List<Integer> arr = new ArrayList();
            //             arr.add(a);
            //             arr.add(b);
            //             arr.add(c);
            //             list.add(arr);
            //             break;
            //         }
            //     }
            //}
        }
        return list;
    }
}
// @lc code=end

