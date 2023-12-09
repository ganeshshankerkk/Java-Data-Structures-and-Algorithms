package src.stack.problems.multipleStacksInOneArray;

/**
 * use a single Array to implement N stacks.
 */
public class MultipleStacksInOneArray {

    //The maximum number of elements that can fit into one stack.
    private int stackCapacity;
    //array which contains of all elements in the three stacks
    private int[] values;
    //An array with three indices,
    // each representing the current number of elements in the respective stacks.
    private int[] sizes;
    //Represents the total number of stacks we’ll allow our array to hold.
    private int numberOfStacks;

    public MultipleStacksInOneArray(int stackSize) {
        stackCapacity = stackSize * stackSize;
        numberOfStacks = stackSize;
        values = new int[stackCapacity];
        sizes = new int[stackSize];
    }

    public boolean isFull(int stackNum) {
        return isValidStack(stackNum) ? sizes[stackNum] == numberOfStacks : false;
    }

    public boolean isEmpty(int stackNum) {
        return isValidStack(stackNum) ? sizes[stackNum] == 0 : false;
    }

    public void push(int value, int stackNum) {
        if (isValidStack(stackNum)) {
            if (isFull(stackNum)) {
                System.out.println("Stack " + stackNum + " is already full. Cannot insert " + value + " to this stack");
            } else {
                sizes[stackNum]++;
                values[indexOfTop(stackNum)] = value;
                System.out.println(value + " added to stack " + stackNum + " successfully!");
            }
        } else {
            System.out.println("No stack exists with the stack number: " + stackNum);
        }

    }

    public int pop(int stackNum) {
        int topElementInStack = -1;
        if (isValidStack(stackNum)) {
            if (isEmpty(stackNum)) {
                System.out.println(stackNum + " is empty. Cannot pop!");
            } else {
                topElementInStack = values[indexOfTop(stackNum)];
                values[indexOfTop(stackNum)] = 0;
                sizes[stackNum]--;
                System.out.println(topElementInStack + " removed from stack " + stackNum);
            }
        } else {
            System.out.println("No stack exists with the stack number: " + stackNum);
        }
        return topElementInStack;
    }

    public int indexOfTop(int stackNum) {
        int indexOfTop = -1;
        if (isValidStack(stackNum)) {
            int offset = stackNum * numberOfStacks;
            int size = sizes[stackNum];
            indexOfTop = offset + size - 1;
        } else {
            System.out.println("No stack exists with the stack number: " + stackNum);
        }
        return indexOfTop;
    }

    public int peek(int stackNum) {
        int elementAtTopIndex = -1;
        if (isValidStack(stackNum) && !isEmpty(stackNum)) {
            elementAtTopIndex = values[indexOfTop(stackNum)];
        }
        return elementAtTopIndex;
    }

    public boolean isValidStack(int stackNum) {
        return stackNum < numberOfStacks;
    }

    public void traverseEntireArrayStack() {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
