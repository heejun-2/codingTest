package programmers;

public class Solution_139 {
	// 주사위 게임 1
	public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 1 && b % 2 == 1) {
        	answer = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        }
        else if(a % 2 == 0 && b % 2 == 0) {
        	answer = Math.abs(a - b);
        }
        else {
        	answer = (a + b) * 2;
        }
        
        return answer;
    }

}
