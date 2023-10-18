package programmers;

public class Solution_86 {
	// 올바른 괄호
	boolean solution(String s) {
        boolean answer = false;

        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') cnt++;
        	if(s.charAt(i) == ')') cnt--;
        	
        	if(cnt < 0) break;
        }
        
        if(cnt == 0) answer = true;

        return answer;
    }

}
