class Deque {
    int[] a = new int[5];
    int f = -1, r = -1;

    boolean isEmpty() { return f == -1; }
    boolean isFull() { return (f == 0 && r == 4) || (f == r + 1); }

    void enqF(int x) {
        if (isFull()) return;
        if (isEmpty()) f = r = 0;
        else f = (f - 1 + 5) % 5;
        a[f] = x;
    }

    void enqR(int x) {
        if (isFull()) return;
        if (isEmpty()) f = r = 0;
        else r = (r + 1) % 5;
        a[r] = x;
    }

    void deqF() {
        if (isEmpty()) return;
        System.out.println(a[f]);
        if (f == r) f = r = -1;
        else f = (f + 1) % 5;
    }

    void deqR() {
        if (isEmpty()) return;
        System.out.println(a[r]);
        if (f == r) f = r = -1;
        else r = (r - 1 + 5) % 5;
    }

    void peek() {
        if (!isEmpty()) System.out.println(a[f]);
    }

    public static void main(String[] args) {
        Deque d = new Deque();
        d.enqR(10); d.enqR(20); d.enqF(5);
        d.deqF(); d.deqR(); d.peek();
    }
}
