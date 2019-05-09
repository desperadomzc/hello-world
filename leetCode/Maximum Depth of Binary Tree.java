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
    public int maxDepth(TreeNode root) {

        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int count) {
        if (node == null) {
            return count;
        } else {
            return Math.max(dfs(node.left, count+1),dfs(node.right, count+1));
        }
    }
}