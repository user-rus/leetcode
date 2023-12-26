package N2.AddTwoNumbers;

public class Solution {
    public static StringBuilder str = new StringBuilder();

    public static ListNode example = new ListNode();
    

    public static ListNode reverse(ListNode l1) {
        ListNode ii ;
        if (l1.next == null) {
            str.append(l1.val);
            return null;
        } else {
            str.append(l1.val);
            ii = l1.next;
        }
        return reverse(ii);
    }

    public static ListNode FinalList(ListNode l1, StringBuilder strEnd) {
        int i = Integer.parseInt(String.valueOf(strEnd.charAt(0)));

        if (strEnd.length() == 1) {

            example = new ListNode(i, l1);

            return example;
        }
        strEnd.deleteCharAt(0);

            example = new ListNode(i, l1);

        return FinalList(example, strEnd);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        reverse(l1);
        str.reverse();
        int a = Integer.parseInt(String.valueOf(str));
        str = new StringBuilder();
        reverse(l2);
        str.reverse();
        int b = Integer.parseInt(String.valueOf(str));
        int c = a + b;
        String end = String.valueOf(c);

        ListNode enddd = FinalList(null, new StringBuilder(end));

        return enddd;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
      //  System.out.println(l1);
        System.out.println(addTwoNumbers(l1, l2));

    }
}
