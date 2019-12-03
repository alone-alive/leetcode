import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 *
 * https://leetcode-cn.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (58.29%)
 * Likes:    96
 * Dislikes: 0
 * Total Accepted:    31K
 * Total Submissions: 52.5K
 * Testcase Example:  '3'
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 3
 * 输出: [1,3,3,1]
 * 
 * 
 * 进阶：
 * 
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> yh = new ArrayList<>(rowIndex+1);
        int[] yha = new int[rowIndex + 1];
        yha[0] = 1;
        for(int i = 0;i <= rowIndex;i++){
            for(int j = i;j > 0;j--){
                yha[j]= yha[j] + yha[j-1];
            }
        }
        for(int i:yha){
            yh.add(i);
        }
        return yh;
    }
}
// @lc code=end

