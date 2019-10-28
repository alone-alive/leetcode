import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 *
 * https://leetcode-cn.com/problems/symmetric-tree/description/
 *
 * algorithms
 * Easy (48.69%)
 * Likes:    476
 * Dislikes: 0
 * Total Accepted:    64K
 * Total Submissions: 131.1K
 * Testcase Example:  '[1,2,2,3,4,4,3]'
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠/ \ / \
 * 3  4 4  3
 * 
 * 
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠  \   \
 * ⁠  3    3
 * 
 * 
 * 说明:
 * 
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right);
    }
    
    public boolean isSymmetric(TreeNode root) {
        // TreeNode lr = null,rr = null;
        // Stack<TreeNode> l = new Stack<>();
        // Stack<TreeNode> r = new Stack<>();
        // if(root != null){
        //     lr = root.left;
        //     rr = root.right;
        //     while((lr!=null||!l.isEmpty())&&(rr!=null||!r.isEmpty())){
        //         int count = 0;
        //         while(lr!=null){
        //             l.push(lr);
        //             lr = lr.left;
        //             count++;
        //         }
        //         while(rr!=null){
        //             r.push(rr);
        //             rr = rr.right;
        //             count--;
        //         }
        //         lr = l.pop();
        //         rr = r.pop();
        //         if(lr.val!=rr.val||count!=0){
        //             return false;
        //         }
        //         lr = lr.right;
        //         rr = rr.left;
        //     }
        // }
        // if((lr!=null||!l.isEmpty())||(rr!=null||!r.isEmpty())){
        //     return false;
        // }
        // return true;
        return isMirror(root, root);
    }
}
// @lc code=end

