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
class DeleteMiddle{
    public ListNode deleteMiddle(ListNode head) {

        if(head == null)
        {
            return head;
        }

        ListNode temp = head;
        int count = 0;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        if(count == 1)				//after adding this condition code got passed as earlier they were passsing only one node
						//due to this our temp2.next getting advanced which result in null and we endup getting nullpointerexception
        {
            head = null;
            return head;
        }

        int middleIndex = count / 2;
        
        ListNode temp2 = head;
        for(int iCnt = 0 ; iCnt < middleIndex - 1; iCnt++)
        {
            temp2 = temp2.next;
        }
         
         temp2.next = temp2.next.next;
         return head;
    }
}