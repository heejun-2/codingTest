package programmers;

import java.util.PriorityQueue;

public class Solution_134 {
	// 더 맵게
	public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int num : scoville) {
        	q.add(num);
        }
        
        while(q.peek() < K) {
        	if(q.size() == 1) return -1;
        	
        	q.add(q.poll() + q.poll() * 2);
        	answer++;
        }
        
        return answer;
    }

}
