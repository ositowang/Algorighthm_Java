public class reverseLinkListTwo {
    private reverseLinkListTwo() {
    };

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)
            return null;
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pre = dummyhead;
        for (int i = 0; i < m - 1; i++)
            pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;
        // then is the node that will be reversed
        // we reverse the sublist by changing then and the first element of the
        // //sublist
        for (int i = 0; i < n - m; i++) {
            // 把头元素和待翻转的元素的下一个元素关联起来
            start.next = then.next;
            // 把待翻转元素指向原来的头元素，这时候头元素的下一个元素已经指向带翻转的//元素的下一个元素了,行程了一个新的链表
            then.next = pre.next;
            // 把sublist的伪头元素和带翻转元素链接起来
            pre.next = then;
            // 更新一下then元素，滑动到下一个待翻转元素
            then = start.next;
        }
        // 把更新完毕的链表的头元素返回出去
        return dummy.next;
    }
}