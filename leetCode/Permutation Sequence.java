class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        String s = "";
        k--;
        while (!nums.isEmpty()) {
            int fact = 1;
            for (int j = n - 1; j > 0; j--) {
                fact *= j;
            }
            int index = k/fact;
            s += nums.get(index);
            nums.remove(index);
            k -= index*fact;
            n--;
        }
        return s;
    }
}