package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_109 {
	// 프로세스
	public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : priorities) {
        	pq.add(num);
        }
        
        while(!pq.isEmpty()) {
        	for(int i = 0; i < priorities.length; i++) {
        		if(priorities[i] == pq.peek()) {
        			if(i == location) {
        				answer++;
        				return answer;
        			}
        			pq.poll();
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

}
