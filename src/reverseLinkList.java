public class reverseLinkList {
    private reverseLinkList() {
    };

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            // 当前节点的指针指向pre的对象
            // pre向前挪动一步。
            // cur向前挪动一步
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}