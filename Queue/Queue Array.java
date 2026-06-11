class QueueArray {
    int[] q = new int[5];
    int front = -1, rear = -1;

    void enqueue(int x) {
        if (rear == q.length - 1) System.out.println("Full");
        else {
            if (front == -1) front = 0;
            q[++rear] = x;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) System.out.println("Empty");
        else front++;
    }

    void peek() {
        if (front == -1 || front > rear) System.out.println("Empty");
        else System.out.println(q[front]);
    }

    void isFull() {
        System.out.println(rear == q.length - 1);
    }

    void isEmpty() {
        System.out.println(front == -1 || front > rear);
    }
}
