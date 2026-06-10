import java.util.Scanner;

class CLL {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head = null, tail = null;

    void insertEnd(int d) {
        Node n = new Node(d);
        if (head == null) head = tail = n;
        else { tail.next = n; tail = n; }
        tail.next = head;
    }

    void insertBeg(int d) {
        Node n = new Node(d);
        if (head == null) head = tail = n;
        else { n.next = head; head = n; }
        tail.next = head;
    }

    void insertPos(int d, int p) {
        if (p == 1) { insertBeg(d); return; }
        Node t = head;
        for (int i = 1; i < p - 1 && t.next != head; i++)
            t = t.next;

        Node n = new Node(d);
        n.next = t.next;
        t.next = n;
        if (t == tail) tail = n;
    }

    void deleteBeg() {
        if (head == null) return;
        if (head == tail) head = tail = null;
        else { head = head.next; tail.next = head; }
    }

    void deleteEnd() {
        if (head == null) return;
        if (head == tail) head = tail = null;
        else {
            Node t = head;
            while (t.next != tail)
                t = t.next;
            t.next = head;
            tail = t;
        }
    }

    void deletePos(int p) {
        if (p == 1) { deleteBeg(); return; }
        Node t = head;
        for (int i = 1; i < p - 1 && t.next != head; i++)
            t = t.next;

        if (t.next == tail) deleteEnd();
        else t.next = t.next.next;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node t = head;
        do {
            System.out.print(t.data + " <-> ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CLL l = new CLL();

        // Create list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            l.insertEnd(sc.nextInt());
        }

        System.out.println("Initial List:");
        l.display();

        // Insert operations
        System.out.print("Insert at beginning: ");
        l.insertBeg(sc.nextInt());

        System.out.print("Insert at end: ");
        l.insertEnd(sc.nextInt());

        System.out.print("Insert value and position: ");
        l.insertPos(sc.nextInt(), sc.nextInt());

        System.out.println("After Insertions:");
        l.display();

        // Delete operations
        l.deleteBeg();
        l.deleteEnd();

        System.out.print("Delete at position: ");
        l.deletePos(sc.nextInt());

        System.out.println("Final List:");
        l.display();

        sc.close();
    }
}

