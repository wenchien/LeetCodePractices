import com.extraClasses.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        List<ListNode> nodeList = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            nodeList.add(current);
            current = current.next;
        }

        return nodeList.get(nodeList.size() / 2);
    }
}
