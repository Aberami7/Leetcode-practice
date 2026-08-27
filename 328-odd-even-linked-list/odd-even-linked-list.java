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
    public ListNode oddEvenList(ListNode head) {

        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(i%2==0)
            {
                even.add(list.get(i));
            }
            else
            {
                odd.add(list.get(i));
            }
        }
        even.addAll(odd);
        ListNode tail=null;
        head=null;
        for(int a:even)
        {
            ListNode k=new ListNode(a);
            if(head==null)
            {
                head=k;
                tail=k;

            }
            else
            {
                tail.next=k;
                tail=k;
            }
        }
        return head;
        
    }
}