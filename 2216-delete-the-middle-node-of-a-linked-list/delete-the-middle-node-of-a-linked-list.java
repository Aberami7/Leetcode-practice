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
    public ListNode deleteMiddle(ListNode head) {
           ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
       
        head=null;
        ListNode tail=null;
        for(int i =0;i<list.size();i++)
        {
            if(i==list.size()/2)
            {
                continue;
            }
            else
            {
            ListNode l=new ListNode(list.get(i));
            if(head==null)
            {
                head=l;
                tail=l;
            }
            else
            {
                tail.next=l;
                tail=l;
            }
        }
        }
        return head;
        
    }
}
