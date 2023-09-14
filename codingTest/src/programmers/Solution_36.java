package programmers;

public class Solution_36 {
	// 히샤드 수
	public boolean solution(int x) {
        boolean answer = true;
        
        int num = x;
        int sum = 0;
        
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        
        if(x % sum == 0){
            return answer;
        }
        else{
            return false;
        }
        
    }

}
