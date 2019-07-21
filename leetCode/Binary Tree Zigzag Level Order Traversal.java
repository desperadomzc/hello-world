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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        if(root == null) return res;
        x.add(root.val);
        res.add(x);
        boolean inorder = true;
        List<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        while(temp.size()>0){
            inorder = !inorder;
            List<TreeNode> child = new ArrayList<>();
            x = new ArrayList<>();
            for(TreeNode t : temp){
                if(t.left!=null) {
                    child.add(t.left);
                    x.add(t.left.val);
                }
                if(t.right!=null) {
                    child.add(t.right);
                    x.add(t.right.val);
                }
            }
            if(!inorder && child.size()!=0) {
                List<Integer> reversex = new ArrayList<>();
                for(int i = x.size()-1;i>=0;i--){
                    reversex.add(x.get(i));
                }
                res.add(reversex);
            }else if(child.size()!=0){
                res.add(x);
            }
            temp = child;
        }
        return res;
    }
}
