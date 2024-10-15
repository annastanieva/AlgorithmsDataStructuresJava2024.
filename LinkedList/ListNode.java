package LinkedList;
public class ListNode {
    int val;
    ListNode next;

    private boolean isEmpty = true;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
        isEmpty = false;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
        isEmpty = false;
    }

    @Override
    public String toString() {
        if (isEmpty) {
            return "[]";
        }
        StringBuilder list = new StringBuilder("[");
        ListNode current = this;

        while (current != null) {
            list.append(current.val);
            current = current.next;
            if (current != null) { // Добавляем запятую только если это не последний элемент
                list.append(",");
            }
        }
        list.append("]");
        return list.toString();
    }
}
