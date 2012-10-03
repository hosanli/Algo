// You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


public class Solution {
    
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        return climb(n, 0, memo);
    }
    
    private int climb(int n, int count, int[] memo) {
        if (n < 0) {
            return count;
        }
        
                
        if (0 == n) {
            return count+1;
        }
                
        if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = climb(n-1, count, memo) + climb(n-2, count, memo);
        return memo[n];
    }
}
    