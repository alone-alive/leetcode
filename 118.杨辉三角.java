import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 *
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (64.20%)
 * Likes:    201
 * Dislikes: 0
 * Total Accepted:    46.4K
 * Total Submissions: 71.6K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 5
 * 输出:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> prv = null;
        for(int i = 1;i <= numRows; i++){
            List<Integer> row = new ArrayList<>(i);
            if(i==1){
                row.add(i);
            }else{
                for(int j = 0;j < i;j++){
                    int num = 0;
                    if(j - 1 >= 0){
                        num += prv.get(j - 1);
                    }
                    if(j < prv.size()){
                        num += prv.get(j);
                    }
                    row.add(num);
                }
            }
            prv = row;
            result.add(row);
        }
        return result;
    }
}
// @lc code=end

