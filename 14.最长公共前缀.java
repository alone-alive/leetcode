/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (34.94%)
 * Likes:    727
 * Dislikes: 0
 * Total Accepted:    135.2K
 * Total Submissions: 386.2K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sub = new StringBuilder();
        if(strs.length >= 1){
            int min_index = 0;
            for(int i = 0; i<strs.length;i++){
                String str = strs[i];
                min_index = str.length() < strs[min_index].length() ? i : min_index;
            }
            for(int j = 0; j<strs[min_index].length();j++){
                boolean flag = true;
                for(String str :strs){
                    if(strs[min_index].charAt(j) != str.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    sub.append(strs[min_index].charAt(j));
                }else{
                    break;
                }
            }
        }
        return sub.toString();
    }
}
// @lc code=end

