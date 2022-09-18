
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        head=head.next; // first node is zero so to avoid it in our ans we do this.
        ListNode newHead=new ListNode(-1); //creating new head.
        ListNode curr=newHead;
        int sum=0;
        while(head!=null)
        {
            
            
            if(head.val!=0)
            {
                sum+=head.val;
            }
            
            else 
            {
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
            }
            
            head=head.next;
        }
        
        return newHead.next;
    }
}
