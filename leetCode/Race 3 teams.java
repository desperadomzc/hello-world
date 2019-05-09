import java.util.*;
class Test {
}
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int t;
        t = Integer.parseInt(cin.nextLine());
        Main s = new Main();
        for(int i = 0;i<t;i++){
            String str = cin.nextLine();
            String[] ss = str.split(" ");
            long n = Long.parseLong(ss[0]);
            long k = Long.parseLong(ss[1]);
            long d1 = Long.parseLong(ss[2]);
            long d2 = Long.parseLong(ss[3]);
            System.out.println(s.sameScore(n,k,d1,d2));
        }
    }

    public String sameScore(long n, long k, long d1, long d2) {
        if(n%3 != 0) return "no";
        long[] score = new long[3];
        for(int i=0;i<4;i++){
            score = getAbc(score,i,k,d1,d2);
            if(score[0] +score[1]+score[2] == 3 * k && score[0]>=0&&score[1]>=0&&score[2]>=0 
               && score[0]<=n&&score[1]<=n&&score[2]<=n
              && score[0]%3 == 0&& score[1]%3 == 0&& score[2]%3 == 0){
                return "yes";
            }
        }
        return "no";
    }

    public long[] getAbc(long[] score,int i,long k,long d1, long d2){
        switch (i){
            //case 0: 1>2>3
            case 0:
                score[1] = (k+d2-d1);
                score[0] = (k+d2+2*d1);
                score[2] = (k-2*d2-d1);
                break;
            //case 1: 3>2>1
            case 1:
                score[0] = (k+2*d2+d1);
                score[1] = (k-d2-2*d1);
                score[2] = (k-d2+d1);
                break;
            //case 2: 2>1,2>3
            case 2:
                score[0] = (k+d2+d1);
                score[1] = (k+d2-2*d1);
                score[2] = (k-2*d2+d1);
                break;
            //case 3: 2<1,2<3
            case 3:
                score[0] = (k-d1-d2);
                score[1] = (k-d2+2*d1);
                score[2] = (k+2*d2-d1);
                break;
        }
        return score;
    }


}