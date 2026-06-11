class CircularQueue {
    int[] q = new int[5];
    int front = -1, rear = -1;

    void enqueue(int x) {
        if ((rear + 1) % q.length == front) {
            System.out.println("Full");
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % q.length;
            q[rear] = x;
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Empty");
        } else {
            System.out.println(q[front] + " removed");
            if (front == rear) front = rear = -1;
            else front = (front + 1) % q.length;
        }
    }

    // ✅ MAIN METHOD 
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();

        q.enqueue(40);
        q.enqueue(50);
    }
}
