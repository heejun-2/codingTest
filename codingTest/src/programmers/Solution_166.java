package programmers;

public class Solution_166 {
	// 암호 해독
	public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = code - 1; i < cipher.length(); i += code) {
        	answer += cipher.charAt(i);
        }
        
        return answer;
    }

}
