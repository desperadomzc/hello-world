class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;
        if(target > nums[nums.length - 1]) return nums.length;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] < target) left++;
            if(nums[right] > target) right--;
            if(nums[left] == target) return left;
            else if(nums[right] == target) return right;
        }
        return left;
    }
}
/*
Don't forget to take into account the extreme situations.
*/