import.java.util.*
class MyQueue {
    int[] arr = new int[1000];
    int front = 0;
    int rear = 0;

    public void push(int x) {
        arr[rear++] = x;
    }

    public int pop() {
        return arr[front++];
    }

    public int peek() {
        return arr[front];
    }

    public boolean empty() {
        return front == rear;
    }
}

