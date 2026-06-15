package programmers4;

public class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for(int i = 0; i < t; i++){
            answer *= 2;
        }
        return answer;
    }
}
//class Solution {
//    public int solution(int n, int t) {
//        // 1. 초기 세균의 수 n을 answer라는 변수에 저장합니다.
//        int answer = n;
//
//        // 2. t시간 동안 반복하기 위한 for문입니다.
//        // i는 0부터 시작해서 t보다 작을 때까지, 즉 총 t번 반복합니다.
//        for (int i = 0; i < t; i++) {
//
//            // 3. answer(현재 세균 수)에 2를 곱하여 다시 answer에 저장합니다.
//            // 1시간이 지날 때마다 세균이 2배가 되는 과정을 나타냅니다.
//            answer *= 2;
//        }
//
//        // 4. 모든 반복이 끝나고 계산된 최종 세균 수(answer)를 반환합니다.
//        return answer;
//    }
//}