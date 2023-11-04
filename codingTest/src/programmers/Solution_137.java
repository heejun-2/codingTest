package programmers;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution_137 {	
	// 배열 만들기 1
	public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = k; i <= n; i++) {
        	if(i % k == 0) list.add(i);
        }
        
        int[] answer = list.stream()
        				.mapToInt(i -> i)
        				.toArray();
        
        return answer;
    }

}
