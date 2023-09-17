package programmers;

public class Solution_43 {
	// 없는 숫자 더하기
	public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i : numbers){
            answer -= i;
        }
        
        return answer;
    }

}
