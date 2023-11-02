package programmers;

import java.util.Arrays;

public class Solution_124 {
	// 중앙값 구하기
	public int solution(int[] array) {
		Arrays.sort(array);
		
        int answer = array[array.length / 2];
        
        return answer;
    }

}
