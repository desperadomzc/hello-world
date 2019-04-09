class Solution {
    public int[] nextPermutation(int[] nums) {
        if (nums.length <= 1) return nums;
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int gap = Integer.MAX_VALUE;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] > nums[i] && gap >= nums[j] - nums[i]){
                    gap = nums[j] - nums[i];
                    index = j;
                }
            }
            if(index!=-1){
                swap(nums,index,i);
                index= i+1;
                break;
            }
        }
        if(index != -1){
            int left = index;
            int right = nums.length - 1;
            while(left < right){
                swap(nums,left,right);
                left++;
                right--;
            }
        }else{
            Arrays.sort(nums);
        }
        return nums;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
