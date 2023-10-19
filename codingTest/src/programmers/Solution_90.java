package programmers;

public class Solution_90 {
	// 피보나치 수
	public int solution(int n) {
        int answer = 0;
        
        int f1 = 0;
        int f2 = 1;
        
        for(int i = 2; i <= n; i++) {
        	int sum = (f1 % 1234567) + (f2 % 1234567);
        	f1 = f2;
        	f2 = sum;
        	
        	if(i == n) {
        		answer = sum % 1234567;
        	}
        }
        
        return answer;
    }

}
