/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        // Helper function call to serialize and find duplicates
        serialize(root, map, result);
        
        return result;
    }
    
    private String serialize(TreeNode node, Map<String, Integer> map, List<TreeNode> result) {
        // Null nodes ke liye delimiter return karo structure retain rakhne ke liye
        if (node == null) {
            return "#";
        }
        
        // Post-order: Pehle subtrees ki string representations layout banao
        String left = serialize(node.left, map, result);
        String right = serialize(node.right, map, result);
        
        // Unique key for the current subtree
        String serial = node.val + "," + left + "," + right;
        
        // Map me frequency track karo
        int count = map.getOrDefault(serial, 0);
        
        // Pehli baar jab duplicate milta hai (count == 1), tabhi result list me add karo
        if (count == 1) {
            result.add(node);
        }
        
        map.put(serial, count + 1);
        
        return serial;
    }
}