import com.extraClasses.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        Queue<Integer> queue1 = convertListNodeToQueue(list1);
        Queue<Integer> queue2 = convertListNodeToQueue(list2);
        // do first
        ListNode result = new ListNode();
        if (queue1.peek() >= queue2.peek()) {
            result.val=queue2.poll();
        } else {
            result.val=queue1.poll();
        }

        ListNode root = result;
        result = result.next;

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
// add to list then convert list to listnode
            if (queue1.isEmpty() && !queue2.isEmpty()) {
                result = new ListNode(queue2.poll());
                System.out.println(result.val);

                result = result.next;
                continue;
            }

            if (!queue1.isEmpty() && queue2.isEmpty()) {
                result = new ListNode(queue1.poll());
                System.out.println(result.val);

                result = result.next;
                continue;
            }

            if ((queue1.peek() >= queue2.peek())) {

                result = new ListNode(queue2.poll());
                System.out.println(result.val);

                result = result.next;
                continue;

            }
            if ((queue1.peek() < queue2.peek())) {
                result = new ListNode(queue1.poll());
                System.out.println(result.val);

                result = result.next;
                continue;
            }


        }
        System.out.println("Validity " + root.next.val);
        return root;
    }

    public Queue<Integer> convertListNodeToQueue(ListNode listNode) {
        Queue<Integer> queue = new LinkedList<>();
        ListNode root = listNode;
        while (root != null) {
            queue.add(root.val);
            root = root.next;
        }
        return queue;
    }
    /*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode();
        ListNode root = answer;

        if ((null == list1 && null == list2) && (0 == list1.val && 0 == list2.val)) {
            System.out.println("Empty");
            return null;
        }

        while(null != list1 && null != list2) {

            if (list1.val >= list2.val) {
                answer.val = list2.val;
                System.out.println(answer.val);
                answer.next = new ListNode();
                answer = answer.next;
                if (list2.next != null) {
                    list2 = list2.next;
                }
            }
            if (list1.val < list2.val){
                answer.val = list1.val;
                System.out.println(answer.val);
                answer.next = new ListNode();
                answer = answer.next;
                if (list1.next != null) {
                    list1 = list1.next;
                }

            }


        }

        return root;
    }*/

}
