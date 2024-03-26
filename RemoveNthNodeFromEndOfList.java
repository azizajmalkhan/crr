
import java.util.List;
import util.ListNode; // Assuming ListNode is defined in the util package

public class RemoveNthNodeFromEndOfList 
{
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;

	        ListNode firstPtr = dummy;
	        ListNode secondPtr = dummy;

	        // Move secondPtr n spaces ahead
	        for (int i = 0; i < n; i++) {
	            secondPtr = secondPtr.next;
	        }

	        // Move both now, until the next of secondPtr is null
	        while (secondPtr.next != null) {
	            firstPtr = firstPtr.next;
	            secondPtr = secondPtr.next;
	        }

	        // We now have to remove the node next of firstPtr
	        firstPtr.next = firstPtr.next.next;

	        return dummy.next;
	    }

	    public static void main(String[] args) {
	        // Create a sample linked list for testing
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        // Instantiate RemoveNthNodeFromEndOfList and remove the 2nd node from end
	        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
	        ListNode result = solution.removeNthFromEnd(head, 2);

	        // Print the modified linked list
	        while (result != null) {
	            System.out.print(result.val + " ");
	            result = result.next;
	        }
	    }


}
