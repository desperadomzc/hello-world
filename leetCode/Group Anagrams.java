/*
stupid solution, list of list
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 0) return Collections.emptyList();
        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        l.add(strs[0]);
        list.add(l);
        for (int i = 0; i < strs.length; i++) {
            boolean flag = true;
            int id = -1;
            for (int j = 0; j < list.size(); j++) {
                String s = list.get(j).get(0);
                flag = s.length() == strs[i].length();
                if(!flag) continue;
                for (char c : strs[i].toCharArray()) {
                    StringBuffer sb = new StringBuffer(s);
                    if (s.indexOf(c) == -1) {flag = false;break;}
                    sb.deleteCharAt(s.indexOf(c));
                    s = sb.toString();
                }
                id = j;
                if (flag) break;
            }
            if (flag) {
                list.get(id).add(strs[i]);
            } else {
                List<String> x = new ArrayList<String>();
                x.add(strs[i]);
                list.add(x);
            }
        }
        list.get(0).remove(0);
        return list;
    }
}
/*
smart solution, hashmap
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 0) return Collections.emptyList();
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> str = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String word = String.valueOf(s);
            if(!str.containsKey(word)){
                str.put(word,new ArrayList<>());
            }
            str.get(word).add(strs[i]);
        }
        for(List<String> s:str.values()){
            list.add(s);
        }
        return list;
    }
}
