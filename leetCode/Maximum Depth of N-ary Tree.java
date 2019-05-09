/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int count = 1;
        List<Integer> l = new ArrayList<>();
        dfs(count,root,l);
        int res = 0;
        for(int i : l){
            if(i > res ){
                res = i;
            }
        }
        return res;
    }

    public void dfs(int count, Node node, List<Integer> counts) {
        if(node.children.size() == 0) {
            counts.add(count);
            return;
        }
        else{
            for(int i = 0;i<node.children.size();i++){
                dfs(count+1,node.children.get(i),counts);
            }
        }
    }
}
