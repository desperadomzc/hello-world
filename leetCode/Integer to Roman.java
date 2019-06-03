class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int q = num / 1000;
        if (q > 0) {
            for (int i = 0; i < q; i++) {
                sb.append("M");
            }
        }
        num -= q * 1000;
        int b = num / 100;
        if (b > 0 && b <= 3) {
            for (int i = 0; i < b; i++) {
                sb.append("C");
            }
        } else if (b >= 4&&b<=8){
            if(b==4) sb.append("CD");
            else {
                sb.append("D");
                for(int j=5;j<b;j++){
                    sb.append("C");
                }
            }
        }else if(b==9){
            sb.append("CM");
        }
        num -= b*100;
        int s = num/10;
        if (s > 0 && s <= 3) {
            for (int i = 0; i < s; i++) {
                sb.append("X");
            }
        } else if (s >= 4&&s<=8){
            if(s==4) sb.append("XL");
            else {
                sb.append("L");
                for(int j=5;j<s;j++){
                    sb.append("X");
                }
            }
        }else if(s==9){
            sb.append("XC");
        }
        num-=s*10;
        int g = num;
        if (g > 0 && g <= 3) {
            for (int i = 0; i < g; i++) {
                sb.append("I");
            }
        } else if (g >= 4&&g<=8){
            if(g==4) sb.append("IV");
            else {
                sb.append("V");
                for(int j=5;j<g;j++){
                    sb.append("I");
                }
            }
        }else if(g==9){
            sb.append("IX");
        }

        return sb.toString();
    }
}
