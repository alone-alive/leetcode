/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 *
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (27.39%)
 * Likes:    1372
 * Dislikes: 0
 * Total Accepted:    125.6K
 * Total Submissions: 457.3K
 * Testcase Example:  '"babad"'
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 
 * 示例 1：
 * 
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 
 * 
 * 示例 2：
 * 
 * 输入: "cbbd"
 * 输出: "bb"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int index = 0;
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            start = i;
            end = i + 1;
            while(start >= 0 && end < s.length()){
                if(s.charAt(start)==s.charAt(end)){
                    if(max < end - start + 1){
                        max = end - start + 1;
                        index = start;
                    }
                    start -=1;
                    end +=1;
                }else{
                    break;
                }
            }
            end = start = i;
            while(start >= 0 && end < s.length()){
                if(s.charAt(start)==s.charAt(end)){
                    if(max < end - start + 1){
                        max = end - start + 1;
                        index = start;
                    }
                    end += 1;
                    start -= 1;
                }else{
                    break;
                }
            }
        }
        if(max == s.length()){
            return s;
        }
        return s.substring(index, index + max);
    }
}
// @lc code=end

