// 1. Node Definition
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

// 2. Core Solution
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    // 3. Simple Test
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Creates a simple tree: 1 -> 2 -> 3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        System.out.println("Max Depth: " + solver.maxDepth(root)); // Output: 3
    }
}
