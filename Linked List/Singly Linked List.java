import java.util.Scanner;

class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    void insertBegin(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void insertEnd(int data) {
        Node n = new Node(data);
        if (head == null) { head = n; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
    }

    void insertAtPos(int data, int pos) {
        if (pos == 1) { insertBegin(data); return; }
        Node n = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) temp = temp.next;
        n.next = temp.next;
        temp.next = n;
    }

    void deleteBegin() {
        if (head != null) head = head.next;
    }

    void deleteEnd() {
        if (head == null || head.next == null) { head = null; return; }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteAtPos(int pos) {
        if (pos == 1) { deleteBegin(); return; }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) temp = temp.next;
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            l.insertEnd(sc.nextInt());
        }

        l.display();

        System.out.print("Insert at beginning: ");
        l.insertBegin(sc.nextInt());

        System.out.print("Insert at end: ");
        l.insertEnd(sc.nextInt());

        System.out.print("Insert data and position: ");
        l.insertAtPos(sc.nextInt(), sc.nextInt());

        l.display();

        l.deleteBegin();
        l.deleteEnd();

        System.out.print("Delete at position: ");
        l.deleteAtPos(sc.nextInt());

        l.display();
    }
}

