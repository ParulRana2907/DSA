import java.util.*;

public class InfixToPostfix {
    static int p(char c) {
        return (c=='+'||c=='-') ? 1 : (c=='*'||c=='/') ? 2 : 0;
    }

    public static void main(String[] args) {
        String s="(a+b)*c", res="";
        Stack<Character> st=new Stack<>();

        for(char ch: s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) res+=ch;

            else if(ch=='(') st.push(ch);

            else if(ch==')') {
                while(st.peek()!='(') res+=st.pop();
                st.pop();
            }

            else {
                while(!st.isEmpty() && p(ch)<=p(st.peek()))
                    res+=st.pop();
                st.push(ch);
            }
        }

        while(!st.isEmpty()) res+=st.pop();

        System.out.println("Postfix: "+res);
    }
}
