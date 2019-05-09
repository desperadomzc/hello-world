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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        List<Integer> pre = new ArrayList<>();
        for (int i : preorder) {
            pre.add(i);
        }
        List<Integer> in = new ArrayList<>();
        for (int j : inorder) {
            in.add(j);
        }
        dfs(in,pre,root);
        return root;
    }

    public void dfs(List<Integer> inorder, List<Integer> preorder, TreeNode root) {
        if (inorder.size() == 1) {
            return;
        }
        else {
            int len = inorder.indexOf(preorder.get(0));
            //left tree:
            if(len > 0){
                root.left = new TreeNode(preorder.get(1));
                dfs(inorder.subList(0,len), preorder.subList(1, len + 1), root.left);
            }
            //right tree:
            if (len + 1 < preorder.size()) {
                root.right = new TreeNode(preorder.get(len+1));
                dfs(inorder.subList(len + 1, inorder.size()), preorder.subList(len + 1, preorder.size()), root.right);
            }
        }
    }
}
