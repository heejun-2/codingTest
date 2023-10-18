package programmers;

public class Solution_87 {
	// 이진 변환 반복하기
	public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.equals("1")) {
        	int cnt = 0;
        	
        	for(int i = 0; i < s.length(); i++) {
        		if(s.charAt(i) == '0') {
        			answer[1]++;
        		}else {
        			cnt++;
        		}
        	}
        	
        	s = Integer.toBinaryString(cnt);
        	answer[0]++;
        }
            
        return answer;
    }

}