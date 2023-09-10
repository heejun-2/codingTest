package programmers;

public class Solution_26 {
	// 짝수는 싫어요
	public int[] solution(int n) {
        int[] answer = new int[(n / 2) + (n % 2)];
        
        int tmp = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                answer[tmp] = i;
                tmp++;
            }
        }
        
        return answer;
    }

}
