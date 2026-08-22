// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode slow = dummy;

       
//         ListNode temp = head;
//         int length = 0;

//         while(temp!=null){
//             length++;
//             temp= temp.next;
//         }

//         for(int i=0;i<length-n;i++){
//             slow = slow.next;
//         }
//         slow.next = slow.next.next;
//         return dummy.next;
        
//     }
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Step 1: Advance the 'fast' pointer by n + 1 steps.
        // This creates a gap of 'n' nodes between fast and slow.
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Step 2: Move both pointers together until 'fast' reaches the end.
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Step 3: 'slow' is now just before the target node. Remove it.
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}