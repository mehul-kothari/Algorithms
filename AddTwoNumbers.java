
public class AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       // System.out.println(l1.val);
	        int sum=0;
	        int count=0;
	        ListNode dummy=new ListNode(0);
	       // ListNode head=null;
	        ListNode result=dummy;
	        int c=0;
	        while(l1!=null && l2!=null)
	        {
	            
	            result.next=new ListNode(0);
	            result=result.next;
	            sum=l1.val+l2.val+count;
	            count=(sum>9) ? 1:0;
	            sum=sum%10;
	            result.val=sum;
	            l1=l1.next;
	            l2=l2.next;
	        }
	        
	        while(l2!=null)
	        {
	            sum=l2.val+count;
	            count=(sum>9) ? 1:0;
	            sum=sum%10;
	            result.next=new ListNode(sum);
	            l2=l2.next;
	            result=result.next;
	        }
	         while(l1!=null )
	        {
	             sum=l1.val+count;
	            count=(sum>9) ? 1:0;
	            sum=sum%10;
	             result.next=new ListNode(sum);
	            l1=l1.next;
	            result=result.next;
	        }
	        if(count==1)
	        {
	            result.next=new ListNode(count);
	            result=result.next;
	        }
	        return dummy.next;
	        
	    }
	}
}
