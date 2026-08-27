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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ArrayList<Integer> list=new ArrayList<>();
         ListNode temp=head;
         while(temp!=null)
         {
            list.add(temp.val);
            temp=temp.next;
         } 
      
        while(left < right)
         {   
          int tem = list.get(left - 1);

           list.set(left - 1, list.get(right- 1));
              list.set(right - 1, tem);

              left++;
            right--;
           }
           head=null;
           ListNode tail=null;
           for(int a:list)
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
