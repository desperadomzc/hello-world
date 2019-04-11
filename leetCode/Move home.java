/*
failed to pass all test:
*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n;
        int[] pi;
        while(cin.hasNextInt())
        {
            n = cin.nextInt();
            pi = new int[n];
            for(int i = 0;i<n;i++){
                pi[i] = cin.nextInt();
            }
            Main m = new Main();
            System.out.println(m.moveTimes(pi,n));
        }
    }

    public int moveTimes(int[] pi, int n){
        boolean[] isOdd = new boolean[n];
        for(boolean b:isOdd){
            b = false;
        }
        return (int)backtrack(pi,isOdd,n,0,0)%1000000007;
    }

    public long backtrack(int[] pi,boolean[] isOdd,int n ,long sum , int from){
        if(from == n) return sum;
        else {
            isOdd[from] = !isOdd[from];
            from = isOdd[from]? pi[from]-1:from+1;
            return backtrack(pi, isOdd,n,sum+1,from);
        }
    }


}

/*
The right solution should be Dynamic programming.
*/