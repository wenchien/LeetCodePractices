import com.extraClasses.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {

    // In order to solve this in O(1) memory
    // Use two pointer
    // first pointer starts at head
    // second pointer moves down the linked list and check if any nodes' nexts that it pass through
    // is the same as node that the first pointer points at
    // Continue until first pointer node.next is null
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        // Create a set as visited
        Set<ListNode> visitedSet = new HashSet<>();
        ListNode current = head;
        while(current != null) {
            if (visitedSet.contains(current)) {
                return current;
            } else {
                visitedSet.add(current);
            }
            current = current.next;

        }

        return null;
    }
}
