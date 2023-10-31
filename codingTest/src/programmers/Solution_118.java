package programmers;

public class Solution_118 {
	// 문자열 나누기
	public int solution(String s) {
        int answer = 1;
        
        char target = s.charAt(0);
        
        int yes = 0;
        int no = 0;
        
    	for(int i = 1; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(target == c) {
    			yes++;
    		}
    		else {
    			no++;
    		}
    		
    		if(yes == no) {
    			answer++;
    			target = s.charAt(i);
    		}
    		
    	}
        
        return answer;
    }

}
