public class removeDupLinkedList {
    private removeDupLinkedList() {
    };

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            if (curNode.next == null)
                break;
            if (curNode.val == curNode.next.val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }

        }
        return head;
    }
}