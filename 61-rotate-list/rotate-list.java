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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.rotate(list,k);
        head=null;
        ListNode tail=null;
        for(int n:list)
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