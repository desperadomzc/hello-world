class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int x = nums[0];
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=x){
                x = nums[i];
                index++;
                nums[index] = x;
            }
        }
        return index + 1;
    }
}