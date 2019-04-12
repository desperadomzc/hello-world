class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(nums.length == 0) return res;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] < target) left++;
            if (nums[right] > target) right--;
            if (nums[left] == target && nums[right] == target) break;
        }
        res[0] = nums[left] == target ? left : -1;
        res[1] = nums[right] == target ? right : -1;
        return res;
    }
}
