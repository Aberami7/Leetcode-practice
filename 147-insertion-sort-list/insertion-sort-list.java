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
    public ListNode insertionSortList(ListNode head) {
List<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        head=null;
        ListNode tail=null;
        for(int a:list)
        {
            ListNode newN=new ListNode(a);
            if(head==null){
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