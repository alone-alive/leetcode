/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (31.64%)
 * Likes:    2538
 * Dislikes: 0
 * Total Accepted:    241.7K
 * Total Submissions: 761.6K
 * Testcase Example:  '"abcabcbb"'
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int MAX_LEN = 0;
        int head = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = head;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    head = j + 1;
                }
            }
            MAX_LEN = i - head + 1 > MAX_LEN ? i - head + 1 : MAX_LEN;
        }
        return MAX_LEN;
    }
}
// @lc code=end

