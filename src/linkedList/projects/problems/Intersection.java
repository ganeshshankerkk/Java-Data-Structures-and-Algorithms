package src.linkedList.projects.problems;

/**
 * @author Ganesh Shanker K K
 * Problem statement: Given two (singly) linked lists,
 * determine if the two lists intersect. Return the intersecting node.
 * Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same
 * node (by reference) as the jth node of the second linked list,
 * then they are intersecting.
 */
public class Intersection {

    public static void main(String[] args) {
        LinkedList llA = new LinkedList();
        llA.insert(3);
        llA.insert(6);
        llA.insert(9);
        llA.insert(12);
        llA.insert(15);

        LinkedList llB = new LinkedList();
        llB.insert(2);
        llB.insert(4);
        llB.insert(6);

        addSameNode(llA, llB, 20);
        addSameNode(llA, llB, 30);
        addSameNode(llA, llB, 40);

        Node intersectingNode = Intersection.findIntersection(llA, llB);
        System.out.println(intersectingNode != null ? intersectingNode.value : "No intersecting node found!");
    }

    static Node findIntersection(LinkedList llA, LinkedList llB) {
        int listASize = llA.size;
        int listBSize = llB.size;
        Node listOne = llA.head;
        Node listTwo = llB.head;

        int size;
        int difference = 0;

        if (listASize == listBSize) {
            size = listASize;
        } else {
            size = listASize > listBSize ? listASize : listBSize;
            difference = listASize > listBSize ? listASize - listBSize : listBSize - listASize;
        }

        if (difference != 0) {
            for (int i = 0; i < difference; i++) {
                if (listASize > listBSize) {
                    listOne = listOne.next;
                } else {
                    listTwo = listTwo.next;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (listOne.next == listTwo.next) {
                return listOne.next;
            }
            listOne = listOne.next;
            listTwo = listTwo.next;
        }

        return new Node();
    }

    /**
     * Add a new node to the end of
     * two linked lists
     *
     * @param llA       Linked list A
     * @param llB       Linked list B
     * @param nodeValue value of new node to be created in
     *                  Linked list A and Linked list B
     */
    static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }
}
