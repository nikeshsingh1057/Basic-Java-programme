// Swapping Nodes in a Linked List

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp1=head;
        int len=0;
        //calculate the length of linked list.
        while(temp1!=null)
        {
            temp1=temp1.next;
            len++;
        }
        ListNode curr=head;
        int i=1;
        while(i<k)
        {
            curr=curr.next;
            i++;
        }
        
        ListNode curr2=head;
        i=1;
        while(i<=len-k)
        {
            curr2=curr2.next;
            i++;
        }
        
        int temp=curr.val;
        curr.val=curr2.val;
        curr2.val=temp;
        
        return head;
    }
}
