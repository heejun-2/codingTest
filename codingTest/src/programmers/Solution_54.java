package programmers;

public class Solution_54 {
	// 최대공약수와 최소공배수
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        
        answer[0] = gcd(max, min);
        answer[1] = (n * m) / answer[0]; 
   
        return answer;
    }
    
    static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        
        return gcd(b, a % b);
    }

}
