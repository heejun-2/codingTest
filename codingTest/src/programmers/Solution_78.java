package programmers;

public class Solution_78 {
    // 소수 찾기
    public int solution(int n) {
        int answer = 0;
        boolean isPass;

        for(int i = 2; i <= n; i++){
            isPass = true;

            if(i == 2){
                answer++;
                continue;
            }

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPass = false;
                    break;
                }
            }

            if(isPass) answer++;

        }

        return answer;

    }
}
