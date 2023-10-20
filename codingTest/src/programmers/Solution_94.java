package programmers;

import java.util.Arrays;

public class Solution_94 {
	// 구명보트
	public int solution(int[] people, int limit) {
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(people);
        
        for(int i = people.length-1; i >= cnt; i--) {
        	if(people[i] + people[cnt] <= limit) {
        		answer++;
        		cnt++;
        	}else {
        		answer++;
        	}
        }
        
        return answer;
    }

}
