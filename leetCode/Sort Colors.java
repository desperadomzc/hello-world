class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length-1;
        int i=0;
        while(i<=two){
            if(nums[i] == 0){
                swap(nums,zero++,i++);
            }else if(nums[i] == 2){
                swap(nums,two--,i);
            }else i++;
        }
    }

    public void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
/*
try quick sort, do not use selection sort, it's silly
*/