class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<sum+nums[i]) sum+=nums[i];
            else sum = nums[i];
            if(maxSum < sum) maxSum = sum;
        }
        return maxSum;
    }
}
