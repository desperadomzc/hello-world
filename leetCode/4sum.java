class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int L = 0;L<nums.length-3;L++){
            if(L>0 && nums[L] == nums[L-1]) continue;
            for(int R = L+1;R<nums.length-2;R++){
                if(R>L+1 && nums[R] == nums[R-1]) continue;
                int l = R+1, r = nums.length - 1;
                int t = target - nums[L] - nums[R];
                while(l < r){
                    if(nums[l]+nums[r] == t){
                        List<Integer> x = new ArrayList<>();
                        x.add(nums[L]);
                        x.add(nums[R]);
                        x.add(nums[l]);
                        x.add(nums[r]);
                        if(res.size() == 0
                                || res.get(res.size()-1).get(0) != nums[L]
                                || res.get(res.size()-1).get(1) != nums[R]
                                || res.get(res.size()-1).get(2) != nums[l]) res.add(x);
                        l++;
                        r--;
                    }
                    else if(nums[l]+nums[r] < t) l++;
                    else r--;
                }
            }
        }
        return res;
    }
}