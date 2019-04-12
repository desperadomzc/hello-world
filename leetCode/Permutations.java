class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return Collections.emptyList();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();
        for(int i:nums) copy.add(i);
        backtrack(copy,new ArrayList<>(),list);
        return list;
    }

    public void backtrack(List<Integer> restnums, List<Integer> temp,List<List<Integer>> list){
        if(restnums.size() == 0){
            list.add(new ArrayList<>(temp));
        }else {
            for (int i = 0; i < restnums.size(); i++) {
                temp.add(restnums.get(i));
                List<Integer> l = new ArrayList<>(restnums);
                l.remove(restnums.get(i));
                backtrack(l,temp,list);
                temp.remove(temp.size()-1);
            }
        }
    }
}