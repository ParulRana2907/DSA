class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class StackLinkedList {
    Node top;

    // PUSH
    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed");
    }

    // POP
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped");
            top = top.next;
        }
    }

    // PEEK
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // ISEMPTY
    boolean isEmpty() {
        return top == null;
    }

    // ISFULL
    boolean isFull() {
        return false; // Linked list stack is never full unless memory ends
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(5);
        s.push(15);
        s.push(25);

        s.peek();
        s.pop();
        s.peek();
    }
}
