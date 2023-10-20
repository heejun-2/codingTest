package programmers;

public class Solution_96 {
	// N개의 최소공배수
	public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
        	// 최대공약수
        	int gcd = gcd(answer, arr[i]);
        	// 최소공배수 = 두 수의 곱 / 최대공약수
        	answer = (answer * arr[i]) / gcd;
        }
        
        
        return answer;
    }

	public int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
