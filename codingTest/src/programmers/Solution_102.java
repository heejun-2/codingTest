package programmers;

import java.util.Arrays;

public class Solution_102 {
    // n^2 배열 자르기
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right - (int)left + 1];

        int idx = 0;
        for(long i = left; i <= right; i++){
            long row = i / n;
            long col = i % n;
            answer[idx++] = Math.max((int)row, (int)col) + 1;
        }

        return answer;
    }
}
