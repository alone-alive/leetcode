import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 *
 * https://leetcode-cn.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (30.38%)
 * Likes:    227
 * Dislikes: 0
 * Total Accepted:    33.4K
 * Total Submissions: 107.6K
 * Testcase Example:  '10'
 *
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * 示例:
 * 
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] nums = new boolean[n];
        for (int i = 2; i < n; i++){
            if (!nums[i]) {
                for (int j = 2; i * j < n; j++) {
                    nums[i * j] = true;
                }
                count++;
            }
        }
        return count;
        // List<Integer> s = new ArrayList<>();
        // for(int i = 2;i<n;i++){
        //     boolean flag = true;
        //     for(Integer m:s){
        //         Integer j = i % m;
        //         if(j.equals(0)){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         s.add(i);
        //     }
        // }
        // return s.size();
    }
}
// @lc code=end

