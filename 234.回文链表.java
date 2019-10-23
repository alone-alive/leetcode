import java.util.Map;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 *
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 *
 * algorithms
 * Easy (38.97%)
 * Likes:    290
 * Dislikes: 0
 * Total Accepted:    43.6K
 * Total Submissions: 111.8K
 * Testcase Example:  '[1,2]'
 *
 * 请判断一个链表是否为回文链表。
 * 
 * 示例 1:
 * 
 * 输入: 1->2
 * 输出: false
 * 
 * 示例 2:
 * 
 * 输入: 1->2->2->1
 * 输出: true
 * 
 * 
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
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
    public boolean isPalindrome(ListNode head) {
        // int size = 0;
        // ListNode l = head;
        // ListNode l1,l2;
        // while(l!=null){
        //     size++;
        //     l = l.next;
        // }
        // l1=l2=head;
        // for(int i = 0;i<size/2;i++){
        //     for(int j = size - i -1;j > 0;j--){
        //         l2 = l2.next;
        //     }
        //     if(l2.val!=l1.val){
        //         return false;
        //     }
        //     l2 = head;
        //     l1 = l1.next;
        // }
        // return true;
        if (head == null || head.next == null)
            return true;

        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            len++;
        }
        // 反转前半段链表
        ListNode cur = head, pre = null;
        for (int i = 0; i < len / 2; i++) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        // 奇数个链表结点cur后移一位
        if ((len & 1) == 1) {
            cur = cur.next;
        }
        // 遍历比较pre和cur的值相等否
        for (ListNode p = cur, q = pre; p != null && q != null; p = p.next, q = q.next) {
            if (p.val != q.val)
                return false;
        }
        return true;
    }
}
// @lc code=end

