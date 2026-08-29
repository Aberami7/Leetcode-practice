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
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        ListNode temp=head;
        while(temp!=null)
        {
           s.append(temp.val);
           temp=temp.next;
        }
        
       
        BigInteger a = new BigInteger(s.toString());
        a = a.multiply(BigInteger.valueOf(2));
        if(a.compareTo(BigInteger.ZERO) == 0)
        {
            return new ListNode(0);
        }

        while(a.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] result = a.divideAndRemainder(BigInteger.TEN);

            list.add(result[1].intValue());

            a = result[0];
        }
    
        Collections.reverse(list);
       ListNode tail=null;
       head=null;
       for(int n:list)
       {
        ListNode k=new ListNode(n);
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