/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 *
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/description/
 *
 * algorithms
 * Easy (40.85%)
 * Likes:    149
 * Dislikes: 0
 * Total Accepted:    45.9K
 * Total Submissions: 111.8K
 * Testcase Example:  '"leetcode"'
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 
 * 案例:
 * 
 * 
 * s = "leetcode"
 * 返回 0.
 * 
 * s = "loveleetcode",
 * 返回 2.
 * 
 * 
 * 
 * 
 * 注意事项：您可以假定该字符串只包含小写字母。
 * 
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        // boolean[] p = new boolean[s.length()];
        // for(int i = 0; i < p.length; i++){
        //     if(!p[i]){
        //         for(int j = 0; j < p.length; j++){
        //             if(!p[j] && i != j && s.charAt(i) == s.charAt(j)){
        //                 p[i] = p[j] = true;
        //             }
        //         }
        //     }
        //     if(!p[i]){
        //         return i;
        //     }
        // }
        // return -1;
        int[] letter=new int[26];
        for (char c:s.toCharArray())
            letter[c-'a']++;
        for (int i = 0; i <s.length() ; i++) {
            if(letter[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
// @lc code=end

