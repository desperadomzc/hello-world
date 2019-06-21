/*time costy*/
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        List<Integer> indices = new ArrayList<>();
        indices.add(0);
        for (int i = 1; i < intervals.length; i++) {
            for(int j = 0;j<i;j++){
                if (isOverlapped(intervals[i],intervals[j])) {
                    intervals[i] = merge(intervals[i], intervals[j]);
                    if (indices.contains(j)) indices.remove((Object) j);
                }
            }
            indices.add(i);
        }
        int[][] res = new int[indices.size()][2];
        for(int j = 0;j<indices.size();j++){
            res[j] = intervals[indices.get(j)];
        }
        return res;
    }
    
    public boolean isOverlapped(int[] a, int[] b) {
        if (a[1] < b[0] || b[1] < a[0]) return false;
        else return true;
    }
    
    public int[] merge(int[] a,int[] b){
        int[] list = new int[2];
        list[0] = Math.min(a[0],b[0]);
        list[1] = Math.max(a[1],b[1]);
        return list;
    }
}
