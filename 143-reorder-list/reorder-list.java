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
    public void reorderList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size()/2;i++)
        {
            list1.add(list.get(i));
            list1.add(list.get(list.size()-1-i));
        }
        if(list.size()%2!=0)
        {
            list1.add(list.get(list.size()/2));
        }
      
       temp = head;

        for(int a : list1)
        {
            temp.val = a;
            temp = temp.next;
        }
    }
}