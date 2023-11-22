package src.linkedList.projects.problems;

/**
 * You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in reverse order,
 * such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * list1 = 7 -> 1 -> 6
 * list2 =  5 -> 9 -> 2
 * result = 2 -> 1 -> 9
 * (617 + 295 = 912)
 */
public class AddNumbers {

    public static void main(String[] args) {
        LinkedList listOne = new LinkedList();
        listOne.insert(7);
        listOne.insert(1);
        listOne.insert(6);
        System.out.print("List 1:: ");
        listOne.traverse();

        LinkedList listTwo = new LinkedList();
        listTwo.insert(5);
        listTwo.insert(9);
        listTwo.insert(2);
        System.out.print("List 2:: ");
        listTwo.traverse();

        LinkedList sum = sum(listOne, listTwo);
        System.out.print("Sum:: ");
        sum.traverse();
    }

    private static LinkedList sum(LinkedList listOne, LinkedList listTwo) {

        Node tempOne = listOne.head;
        Node tempTwo = listTwo.head;

        LinkedList sumList = new LinkedList();
        /*Handle scenario when both lists has different size
        If size of both the lists are different, add new node with value as zero to the end of the list.*/
        if (listOne.size != listTwo.size) {
            addBlankValueNode(listOne, listTwo);
        }

        for (int i = 0; i < listOne.size; i++) {
            int sum = tempOne.value + tempTwo.value;
            if (sum > 9) {
                sumList.insert(sum % 10);
                tempOne = tempOne.next;
                tempOne.value += (sum / 10);
            } else {
                sumList.insert(tempOne.value + tempTwo.value);
                tempOne = tempOne.next;
            }
            tempTwo = tempTwo.next;
        }
        return sumList;
    }

    private static void addBlankValueNode(LinkedList listOne, LinkedList listTwo) {
        if (listOne.size > listTwo.size) {
            createNewNode(listTwo, listOne.size - listTwo.size);
        } else {
            createNewNode(listOne, listTwo.size - listOne.size);
        }
    }

    private static void createNewNode(LinkedList linkedList, int difference) {
        for (int i = 0; i < difference; i++) {
            linkedList.insert(0);
        }
    }
}
