package programmers;

public class Solution_79 {
	// 기사단원의 무기
	public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int cnt;
        
        for(int i = 1; i <= number; i++){
            cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(j * j == i) cnt++;
                else if(i % j == 0) cnt += 2;
            }
            if(cnt > limit){
                answer += power;
            }
            else{
                answer += cnt;
            }
        }
        
        return answer;
    }

}
