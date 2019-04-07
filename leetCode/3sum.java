class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i];
            int left = i+1,right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] == target){
                    List<Integer> x = new ArrayList<>();
                    x.add(-target);
                    x.add(nums[left]);
                    x.add(nums[right]);
                    if(res.size() == 0 || (res.size()!=0 && nums[left] != res.get(res.size()-1).get(1)
                            || nums[right] != res.get(res.size()-1).get(2))) res.add(x);
                    left++;
                    right--;
                    continue;
                }
                if(nums[left] + nums[right] > target) right--;
                else if(nums[left] + nums[right] < target) left++;
            }
        }
        return res;
    }
}
//left&right Pointer