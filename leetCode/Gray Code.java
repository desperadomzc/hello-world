class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if(n == 0) return list;
        for(int i =0;i<n;i++){
            int x = 1 << i;
            for(int j = list.size()-1;j>=0;j--){
                list.add(x+list.get(j));
            }
        }
        return list;
    }
}