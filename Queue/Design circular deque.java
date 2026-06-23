import java.util.*;

class MyCircularDeque {
    Deque<Integer> d = new ArrayDeque<>();
    int k; //max size of deque

    public MyCircularDeque(int k) { this.k = k; } //capacity initiazed

    public boolean insertFront(int v) { return d.size()<k && d.offerFirst(v); }
    public boolean insertLast(int v)  { return d.size()<k && d.offerLast(v); }
    public boolean deleteFront()      { return d.pollFirst()!=null; }
    public boolean deleteLast()       { return d.pollLast()!=null; }
    public int getFront()             { return d.isEmpty()? -1 : d.peekFirst(); }
    public int getRear()              { return d.isEmpty()? -1 : d.peekLast(); }
    public boolean isEmpty()          { return d.isEmpty(); }
    public boolean isFull()           { return d.size()==k; }
}
