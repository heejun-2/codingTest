package programmers;

public class Solution_143 {
    // 더 크게 합치기
    public int solution(int a, int b) {
        int answer = Math.max(Integer.valueOf((String.valueOf(a) + String.valueOf(b))), Integer.valueOf((String.valueOf(b) + String.valueOf(a))));

        return answer;
    }
}
