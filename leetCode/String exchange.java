import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        String[] ss = new String[2];
        ss = cin.nextLine().split(" ");
        int n = Integer.parseInt(ss[0]),m = Integer.parseInt(ss[1]);
        Main main = new Main();
        String s = cin.nextLine();
        System.out.println(Math.max(main.maxLength(s,m,'a'),main.maxLength(s,m,'b')));
        cin.close();
    }

    public int maxLength(String s , int m, char c){
        if(s.length() == 0) return 0;
        List<Integer> index = new ArrayList<>();
        for(int i = 0;i<s.length() ;i++){
            if(s.charAt(i) == c){
                index.add(i);
            }
        }
        if(index.size()<=m) return s.length();
        index.add(s.length());
        int max = index.get(m);
        for(int k = m+1;k<index.size();k++){
            max = Math.max(index.get(k) - index.get(k-m-1)-1,max);
        }

        return max;
    }
}
