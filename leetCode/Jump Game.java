class Solution {
    public boolean canJump(int[] nums) {
        return canJump(0,nums);
    }
    
    public boolean canJump(int num,int[] nums){
        if(num >= nums.length-1 || nums[num]+num >= nums.length - 1) return true;
        int max = nums[num];
        int index = num;
        for(int x = 1;x <= nums[num];x++){
            int n = nums[x+num]+x;
            if(n >= max) {
                max = n;
                index = num+x;
            } 
        }
        if(max == nums[num]) return false;
        return canJump(index,nums);
    }
}


public class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
