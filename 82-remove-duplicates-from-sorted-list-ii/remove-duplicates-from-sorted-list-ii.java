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
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
           list.add(temp.val);
            temp=temp.next;
        }
        for(int n:list)
        {
             map.put(n,map.getOrDefault(n,0)+1);
        }
        head=null;
        ListNode tail=null;
        for(int n:list)
        {
           if(map.get(n)==1){
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
       
        
    }
     return head;
    }
}