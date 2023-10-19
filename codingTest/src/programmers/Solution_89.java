package programmers;

public class Solution_89 {
	// 다음 큰 숫자
	public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toBinaryString(n);
        
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == '1') cnt++;
        }
        
        for(int i = n+1; i < 1000000; i++) {
        	String s = Integer.toBinaryString(i);
        	int s_cnt = 0;
        	for(int j = 0; j < s.length(); j++) {
        		if(s.charAt(j) == '1') s_cnt++;
        	}
        	
        	if(cnt == s_cnt) {
        		answer = i;
        		break;
        	}
        }

        return answer;
    }

}
