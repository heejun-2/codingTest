package programmers;

public class Solution_25 {
	// 문자열 곱하기
	public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        
        return answer;
    }

}
