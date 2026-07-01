import java.util.*;

class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();
        
        for (String x : t) {
            switch (x) {
                case "+": s.push(s.pop() + s.pop()); break;
                case "-": { int b = s.pop(), a = s.pop(); s.push(a - b); break; }
                case "*": s.push(s.pop() * s.pop()); break;
                case "/": { int b = s.pop(), a = s.pop(); s.push(a / b); break; }
                default: s.push(Integer.parseInt(x));
            }
        }
        return s.pop();
    }
}
