package programmers6;

class Solution {
    public int[] solution(int[] arr, int n) {
        int start; // 시작 인덱스를 담을 변수 선언

        // 1. 배열의 길이를 확인하여 시작 인덱스를 결정합니다.
        if (arr.length % 2 != 0) {
            // 배열의 길이가 홀수라면
            start = 1;
        } else {
            // 배열의 길이가 짝수라면
            start = 0;
        }

        // 2. 결정된 시작점부터 2씩 건너뛰며 값을 더합니다.
        for (int i = start; i < arr.length; i = i + 2) {
            arr[i] = arr[i] + n;
        }

        // 3. 수정된 배열을 반환합니다.
        return arr;
    }
}
