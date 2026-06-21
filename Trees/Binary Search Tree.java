import java.util.*;

class BST {
    class Node {
        int d; Node l, r;
        Node(int x) { d = x; }
    }

    Node root;

    Node insert(Node n, int x) {
        if (n == null) return new Node(x);
        if (x < n.d) n.l = insert(n.l, x);
        else n.r = insert(n.r, x);
        return n;
    }

    Node delete(Node n, int x) {
        if (n == null) return null;

        if (x < n.d) n.l = delete(n.l, x);
        else if (x > n.d) n.r = delete(n.r, x);
        else {
            if (n.l == null) return n.r;
            if (n.r == null) return n.l;

            Node t = n.r;
            while (t.l != null) t = t.l;

            n.d = t.d;
            n.r = delete(n.r, t.d);
        }
        return n;
    }

    void in(Node n) { if (n != null) { in(n.l); System.out.print(n.d+" "); in(n.r); } }
    void pre(Node n){ if (n != null) { System.out.print(n.d+" "); pre(n.l); pre(n.r); } }
    void post(Node n){ if (n != null){ post(n.l); post(n.r); System.out.print(n.d+" "); } }

    public static void main(String[] args) {
        BST t = new BST();
        t.root = t.insert(t.root, 50);
        t.insert(t.root, 30);
        t.insert(t.root, 70);

        t.in(t.root); System.out.println();
        t.pre(t.root); System.out.println();
        t.post(t.root); System.out.println();

        t.root = t.delete(t.root, 30);
        t.in(t.root);
    }
}
