package programmers;

public class Solution_34 {
	// 정수 제곱근 판별
	public long solution(long n) {
        Double x = Math.sqrt(n);
        
        if(x == x.intValue()){
            return (long)Math.pow(x + 1, 2);
        }else{
            return -1;
        }
    }

}
