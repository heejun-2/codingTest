package programmers;

public class Solution_68 {
	// 푸드 파이트 대회
	public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                answer += String.valueOf(i);
            }
        }

        String reverse = "";
        for(int i = answer.length() - 1; i >= 0; i--){
            reverse += answer.charAt(i);
        }
            
        answer += "0" + reverse;
        return answer;
    }

}
