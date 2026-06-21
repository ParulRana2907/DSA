import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    static int max = Integer.MIN_VALUE;

    static int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        max = Math.max(max, left + right + node.val);

        return Math.max(left, right) + node.val;
    }

    static TreeNode createTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1) return null; // -1 represents NULL

        TreeNode node = new TreeNode(val);
        node.left = createTree(sc);
        node.right = createTree(sc);

        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree in preorder (-1 for null):");
        TreeNode root = createTree(sc);

        dfs(root);

        System.out.println("Maximum Path Sum = " + max);

        sc.close();
    }
}
