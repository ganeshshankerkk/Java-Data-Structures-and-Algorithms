package src.linkedList.projects.problems;

/**
 * <p>
 * Given a linked list, return node
 * which is located n times from the
 * last node.
 * </p>
 */
public class NthToLast {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(5);
        linkedList.insert(1);

        linkedList.traverse();
        int steps = 3;
        System.out.println("Node located " + steps + " steps from the end: "
                + nthLastElement(linkedList, steps).value);
    }

    /**
     * @param linkedList
     * @param n          node to be returned from tail
     * @return node which is n steps from tail
     */
    static Node nthLastElement(LinkedList linkedList, int n) {
        if (n <= linkedList.size && n > 0) {
            Node n1 = linkedList.head;
            Node n2 = linkedList.head;
            for (int i = 0; i < n; i++) {
                if (n2 == null) {
                    return null;
                }
                n2 = n2.next;
            }
            while (n2 != null) {
                n1 = n1.next;
                n2 = n2.next;
            }
            return n1;
        }
        return new Node();
    }

    /**
     * <p> Another approach to find the node
     * located n times from last by using linked list
     * size to determine the node.</p>
     *
     * @param linkedList
     * @param n          node to be returned from tail
     * @return node which is n steps from tail
     */
    static Node nthToLast(LinkedList linkedList, int n) {
        int listSize = linkedList.size;
        Node node = linkedList.head;
        if (linkedList.size > 0) {
            for (int i = 0; i < (listSize - n); i++) {
                node = node.next;
            }
            return node;
        } else {
            return new Node();
        }
    }
}
