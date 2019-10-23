/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (64.86%)
 * Likes:    615
 * Dislikes: 0
 * Total Accepted:    110.6K
 * Total Submissions: 169.8K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode L1;
        // if(head.next!=null){
        //     L1 = L2 = reverseList(head.next);
        //     while(L2.next!=null){
        //         L2 = L2.next;
        //     }
        //     L2.next = head;
        //     head.next = null;
        //     return L1;
        // }
        L1 = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return L1;
    }
}
// @lc code=end

