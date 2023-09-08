package programmers;

public class Solution_22 {
	// 배열의 평균값
	public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }
        
        return answer / numbers.length;
    }

}
