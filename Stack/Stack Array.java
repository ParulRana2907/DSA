class StackArray {
    int max = 5;
    int top = -1;
    int stack[] = new int[max];

    // PUSH
    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
            System.out.println(val + " pushed");
        }
    }

    // POP
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    // PEEK
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // ISEMPTY
    boolean isEmpty() {
        return top == -1;
    }

    // ISFULL
    boolean isFull() {
        return top == max - 1;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
        s.pop();
        s.peek();
    }
}
