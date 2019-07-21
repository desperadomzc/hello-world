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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return Collections.emptyList();
        helper(root);
        return list;
    }
    
    public void helper(TreeNode root){
        if(root.left != null){
            helper(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            helper(root.right);
        }
    }
}
/*
the iterative solution:
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return Collections.emptyList();
        Stack<TreeNode> s = new Stack<>();
        while(root!=null || !s.isEmpty()){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
*/
