
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy  = new ListNode(0);

        dummy.next = head;

        ListNode prev = dummy;

        // prev left ke just 1 piche point kar raha hai  
        //1 ,2 ,3 , 4 , 5
        //  prev
        for(int i=1;i<left;i++){
            prev = prev.next;
        }
         //1 ,2 ,3 , 4 , 5
        //  prev 
        //      curr   cur r left ko point kar raha 
        ListNode curr = prev.next;

        // reverse start 
        for(int i =0;i<right - left; i++){
            ListNode nextnode = curr.next;
            curr.next = nextnode.next;
            nextnode.next = prev.next;
            prev.next = nextnode;
        }
        return dummy.next;
        
    }
}