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
