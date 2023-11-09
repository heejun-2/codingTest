package programmers;

public class Solution_162 {
	// A 강조하기
	public String solution(String myString) {
        String answer = myString.toLowerCase();
        answer = answer.replace("a", "A");
        
        return answer;
    }

}
