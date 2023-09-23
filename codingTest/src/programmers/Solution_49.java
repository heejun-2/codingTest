package programmers;

import java.util.Arrays;

public class Solution_49 {
	// 문자열 내림차순으로 배치하기
	public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        
        Arrays.sort(c);
        
        for(int i = c.length-1; i >= 0; i--){
            answer += c[i];
        }
        
        return answer;
    }

}
