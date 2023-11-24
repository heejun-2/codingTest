package programmers;

public class Solution_178 {
    // 중복된 숫자 개수
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int num : array){
            if(num == n) answer++;
        }

        return answer;
    }
}
