import java.util.Stack;

public class ReverseSentenceStack {
    public static void main(String[] args) {

        String str = "data structures and algorithms";

        System.out.println("Original Sentence: " + str);

        Stack<String> stack = new Stack<>();

        String words[] = str.split(" ");

        for (String w : words) {
            stack.push(w);
        }

        System.out.print("Reversed Sentence: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
