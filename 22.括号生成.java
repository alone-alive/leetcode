/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {

    public List<String> ss = new ArrayList();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        create(sb,n,n);
        return ss;
    }
    public void create(StringBuilder str,int l,int r) {
        if (l > r) {
            return ;
        }
        if (l > 0) {
            StringBuilder nstr = new StringBuilder(str);
            nstr.append("(");
            create(nstr,l - 1,r);
        }
        if (r >= l && r > 0) {
            StringBuilder nstr = new StringBuilder(str);
            nstr.append(")");
            create(nstr,l,r - 1);
        }
        if(0 == r) {
            ss.add(str.toString());
        }
    }
}
// @lc code=end

