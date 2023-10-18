package programmers;

import java.util.StringTokenizer;

public class Solution_84 {
	// JadenCase 문자열 만들기
	public String solution(String s) {
        s = s.toLowerCase();
        
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder answer = new StringBuilder();
        
        while(st.hasMoreTokens()) {
        	String str = st.nextToken();
        	if(str.equals(" ")) {
        		answer.append(" ");
        	}
        	else {
        		answer.append(str.substring(0, 1).toUpperCase() + str.substring(1));
        	}
        }
        
        return answer.toString();
    }

}
