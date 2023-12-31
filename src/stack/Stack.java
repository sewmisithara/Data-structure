package stack;


public class Stack {
    private int[] elementData;
    private int top;    // points to the top of the stack(last element)

    public Stack(final int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            grow();
//            throw new RuntimeException("Stack is full");
            /*System.err.println("Stack is full");
            return;*/
        }
        elementData[++top] = data;
    }

    private void grow() {
        int[] temp = elementData;

        elementData = new int[elementData.length * 2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        }
        return elementData[top--];
    }

    public int peek() { //top
        if(isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        }
        return elementData[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == elementData.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        top = -1;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println(isEmpty() ? "Empty stack]" : "\b\b]");
    }
}
