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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                list.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(list);
       ListNode head = null;
ListNode tail = null;

for(int a : list)
{
    ListNode node = new ListNode(a);

    if(head == null)
    {
        head = node;
        tail = node;
    }
    else
    {
        tail.next = node;
        tail = node;
    }
}

return head;
        
    }
}