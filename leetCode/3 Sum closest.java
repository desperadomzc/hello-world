class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-2;i++){
            int l = i+1,r = nums.length-1;
            while(l < r){
                int sum = nums[l] + nums[r] + nums[i];
                if(sum < target){
                    l++;
                    res = Math.abs(res) < (target - sum)? res : target - sum;
                }else if(sum > target){
                    r--;
                    res = Math.abs(res) < (sum - target)? res : target - sum;
                }else return target;
            }
        }
        return target - res;
    }
}