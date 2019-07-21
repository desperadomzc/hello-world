class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<=(int)Math.pow(2,nums.length)-1;i++){
            String s = bytetoDecimal(i);
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == '1'){
                    temp.add(nums[j]);
                }
            }
            res.add(temp);
        }
        return res;
    }

    public String bytetoDecimal(int num){
        String str = "";
        while(num>0){
            str += num%2;
            num /= 2;
        }
        return str;
    }
}