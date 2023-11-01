package programmers;

import java.util.ArrayList;

public class Solution_122 {
	// n의 배수 고르기
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
        int[] answer = list.stream()
        				.mapToInt(i -> i)
        				.toArray();
        
        return answer;
    }

}
