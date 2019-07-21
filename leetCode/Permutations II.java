class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums,res,new ArrayList<>(),visited,0);
        return res;
    }

    public void backtracking(int[] nums, List<List<Integer>> res, List<Integer> temp,boolean[] visited,int count) {
        if(count == nums.length) {
            if(!res.contains(temp)) res.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i = 0;i<nums.length;i++){
                if(!visited[i]){
                    temp.add(nums[i]);
                    visited[i] = true;
                    backtracking(nums,res,temp,visited,count+1);
                    visited[i] = false;
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
