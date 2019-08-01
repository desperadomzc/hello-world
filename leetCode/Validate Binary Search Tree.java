/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        long low = Long.MIN_VALUE;
        long high = Long.MAX_VALUE;

        return helper(root, low, high);
    }

    public boolean helper(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;

        return helper(root.left, low, root.val) && helper(root.right, root.val, high);
    }
}
