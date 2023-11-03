package programmers;

public class Solution_130 {
	// 배열의 유사도
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String str : s1) {
        	for(String s : s2) {
        		if(str.equals(s)) {
        			answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }

}
