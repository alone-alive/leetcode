import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/description/
 *
 * algorithms
 * Medium (59.12%)
 * Likes:    296
 * Dislikes: 0
 * Total Accepted:    52K
 * Total Submissions: 87.8K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * 
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 返回其层次遍历结果：
 * 
 * [
 * ⁠ [3],
 * ⁠ [9,20],
 * ⁠ [15,7]
 * ]
 * 
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        Queue<TreeNode> q3 = null;
        List<Integer> num = new ArrayList<>();
        TreeNode r = null;
        q1.add(root);
        while(!q1.isEmpty()||!q2.isEmpty()){
            while(!q1.isEmpty()){
                r = q1.remove();
                if(r==null){
                    break;
                }
                if(r.left != null){
                    q2.add(r.left);
                }
                if(r.right != null){
                    q2.add(r.right);
                }
                num.add(r.val);
            }
            result.add(num);
            num = new ArrayList<>();
            q3 = q1;
            q1 = q2;
            q2 = q3;
        }
        return result;
    }
}
// @lc code=end

