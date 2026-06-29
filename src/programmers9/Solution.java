package programmers9;

public class Solution {
    public int solution(int n, int k) {

        int lambPrice = n * 12000;

        int freeDrinks = n / 10;

        int drinkPrice = (k - freeDrinks) * 2000;

        // 4. 총합 반환
        return lambPrice + drinkPrice;
    }
}