import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorder(node.left, res);   // Left
        res.add(node.val);         // Root
        inorder(node.right, res);  // Right
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        
        // Tree: 1 -> null, 2 -> 3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(solver.inorderTraversal(root)); // Output: [1, 3, 2]
    }
}
