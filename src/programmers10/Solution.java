package programmers10;


public class Solution {
    public int solution(int n) {
        Solution sol = new Solution();

        System.out.println(sol.solution(20));
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
