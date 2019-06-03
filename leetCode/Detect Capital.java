class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        if(word.equals(up) || word.equals(low)){
            return true;
        }else if(word.charAt(0) >= 'A' && word.charAt(0)<= 'Z'){
            return word.substring(1).equals(word.substring(1).toLowerCase());
        }else{
            return false;
        }
    }
}
