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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> roots = new ArrayList<>();

        roots.add(root);
        List<TreeNode> temp;
        List<Integer> line= new ArrayList<>();
        line.add(root.val);
        res.add(line);

        while (true) {
            line = new ArrayList<>();
            temp = new ArrayList<>();
            for (TreeNode t : roots) {
                if (t.left != null){
                    temp.add(t.left);
                    line.add(t.left.val);
                }
                if(t.right != null){
                    temp.add(t.right);
                    line.add(t.right.val);
                }
            }
            if(line.size()!= 0 ) res.add(line);
            else break;
            roots = temp;
        }

        return res;
    }
}
