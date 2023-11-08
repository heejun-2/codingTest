package programmers;

public class Solution_156 {
	// 원하는 문자열 찾기
	public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = myString.toLowerCase();
        String target = pat.toLowerCase();
        
        if(str.contains(target)) {
        	answer = 1;
        }
        
        return answer;
    }

}
