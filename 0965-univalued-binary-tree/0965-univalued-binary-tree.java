class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return check(root, root.val);
    }
    
    private boolean check(TreeNode node, int val) {
        // Base case: null node is always valid
        if (node == null) return true;
        
        // If value mismatch occurs anywhere, return false immediately
        if (node.val != val) return false;
        
        // Recursively check left and right subtrees
        return check(node.left, val) && check(node.right, val);
    }
}
