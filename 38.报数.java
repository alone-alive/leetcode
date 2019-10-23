/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (52.83%)
 * Likes:    324
 * Dislikes: 0
 * Total Accepted:    53.9K
 * Total Submissions: 101.6K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        StringBuilder a = new StringBuilder("1");
        StringBuilder b;
        for(int i = 0; i < n - 1; i++){
            b = new StringBuilder();
            int j = 0;
            char p = ' ';
            int pc = 0;
            while(j<a.length()){
                if(p==' '){
                    p=a.charAt(j);
                    pc++;
                }else if(p == a.charAt(j)) {
                    pc++;
                }else {
                    b.append(pc).append(p);
                    p=a.charAt(j);
                    pc = 1;
                }
                j++;
            }
            b.append(pc).append(p);
            a = b;
        }
        return a.toString();
    }
}
// @lc code=end

