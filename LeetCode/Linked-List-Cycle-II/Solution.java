1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if(head==null) return null;
15        ListNode slow=head, fast=head;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19            if(slow==fast) break;
20        }
21        if(fast==null || fast.next==null) return null;
22        slow=head;
23        while(fast!=slow){
24            slow=slow.next;
25            fast=fast.next;
26        }
27        return slow;
28    }
29}