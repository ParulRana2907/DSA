import java.util.*;

class DLL {
    class Node {
        int d; Node p,n;
        Node(int d){ this.d=d; }
    }
    Node h;

    void ib(int d){
        Node x=new Node(d);
        if(h!=null) h.p=x;
        x.n=h; h=x;
    }

    void ie(int d){
        Node x=new Node(d);
        if(h==null){ h=x; return; }
        Node t=h;
        while(t.n!=null) t=t.n;
        t.n=x; x.p=t;
    }

    void ip(int d,int pos){
        if(pos<=1){ ib(d); return; }
        Node t=h;
        for(int i=1;i<pos-1 && t.n!=null;i++) t=t.n;
        Node x=new Node(d);
        x.n=t.n; x.p=t;
        if(t.n!=null) t.n.p=x;
        t.n=x;
    }

    void db(){
        if(h==null) return;
        h=h.n;
        if(h!=null) h.p=null;
    }

    void de(){
        if(h==null||h.n==null){ h=null; return; }
        Node t=h;
        while(t.n!=null) t=t.n;
        t.p.n=null;
    }

    void dp(int pos){
        if(pos<=1){ db(); return; }
        Node t=h;
        for(int i=1;i<pos && t!=null;i++) t=t.n;
        if(t==null) return;
        if(t.n!=null) t.n.p=t.p;
        if(t.p!=null) t.p.n=t.n;
    }

    void show(){
        for(Node t=h;t!=null;t=t.n)
            System.out.print(t.d+" <-> ");
        System.out.println("NULL");
    }

    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        DLL l=new DLL();

        System.out.print("Enter number of nodes: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter data: ");
            l.ie(s.nextInt());
        }
        l.show();

        System.out.print("Insert at Beginning (data): ");
        l.ib(s.nextInt());

        System.out.print("Insert at End (data): ");
        l.ie(s.nextInt());

        System.out.print("Insert at Position (data position): ");
        l.ip(s.nextInt(),s.nextInt());
        l.show();

        System.out.println("Deleting at Beginning");
        l.db();

        System.out.println("Deleting at End");
        l.de();

        System.out.print("Delete at Position: ");
        l.dp(s.nextInt());
        l.show();
    }
}

