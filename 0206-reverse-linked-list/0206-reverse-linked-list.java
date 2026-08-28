class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        // int len = 0;
        // ListNode l = head;

        // while(l != null){
        //     len++;
        //     l=l.next;
        // }
        // int x = 0;
        // ListNode[] arr = new ListNode[len];
        // l = head; 
        // while(l != null){
        //     arr[x] = l;
        //     l=l.next;
        //     x++;
        // }

        // int start = 0,
        //     end= len-1;

        // while(start<end){
        //     ListNode temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] =temp;
        //     start++;
        //     end--;
        // }
        // for(int k=0;k<len-1;k++){
        //     arr[k].next = arr[k+1];
        // }
        // arr[len-1].next  = null;

        // return arr[0];
        
        ListNode prev = null;
        ListNode curr = head;
         ListNode next_node;
        while(curr!=null){
             next_node = curr.next;
             curr.next = prev;
              prev = curr;
             curr =  next_node;
        }
        
        
       
        return prev;



    }
}