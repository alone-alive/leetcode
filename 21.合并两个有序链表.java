/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (57.60%)
 * Likes:    664
 * Dislikes: 0
 * Total Accepted:    124.4K
 * Total Submissions: 215.5K
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head , tail, next1 , next2;
        if(null == l1){
            return l2;
        }
        if(null == l2){
            return l1;
        }
        next1 = l1;
        next2 = l2;
        head = tail = new ListNode(0);
        while(true){
            if(next1!=null&&next2!=null){
                if(next1.val <= next2.val){
                    tail.next = next1;
                    next1 = next1.next;
                    tail = tail.next;
                } else {
                    tail.next = next2;
                    next2 = next2.next;
                    tail = tail.next;
                }
            }else if (next1==null&&next2!=null){
                tail.next = next2;
                break;
            }else if (next1!=null&&next2==null){
                tail.next = next1;
                break;
            }else{
                break;
            }
        }
        return head.next;
    }
}
// @lc code=end

