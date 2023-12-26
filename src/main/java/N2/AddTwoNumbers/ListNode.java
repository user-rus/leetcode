package N2.AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next;

    @Override
    public String toString() {
        return "[" +val + "]";
    }

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
