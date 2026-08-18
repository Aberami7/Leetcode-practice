/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set=new LinkedHashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            set.add(temp.val);
            temp=temp.next;
        }
         head=null;
        ListNode tail=null;
        for(int n:set)
        {
            ListNode newN=new ListNode(n);
            if(head==null)
            {
                head=newN;
                tail=newN;
            }
            else
            {
                tail.next=newN;
                tail=newN;
            }
        }
        return head;
        

        
    }
}