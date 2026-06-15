package programmers3;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i =0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length -1 -i];
            // num_list.length -1 -i : 배열의 뒤쪽에서부터 앞으로 하나씩 옮겨오는 인덱스 공식
        }

        return answer;
    }
}
