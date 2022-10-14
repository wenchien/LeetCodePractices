import com.extraClasses.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        List<Integer> listNodeList = convertToList(head);
        Collections.reverse(listNodeList);
        ListNode newHead = new ListNode();
        ListNode root = newHead;
        for(int i = 0; i < listNodeList.size(); ++i) {
            newHead.val = listNodeList.get(i);
            if (i != listNodeList.size() - 1) {
                newHead.next = new ListNode();
            }
            newHead = newHead.next;
        }

        return root;
    }

    private List<Integer> convertToList(ListNode root) {
        List<Integer> result = new ArrayList<>();
        while(root != null) {
            result.add(root.val);
            root = root.next;
        }
        return result;
    }
}
