package programmers;

import java.util.Stack;

public class Solution_121 {
	// 햄버거 만들기
	public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient) {
        	stack.push(i);
        	if(stack.size() >= 4) {
        		int size = stack.size();
        		if(stack.get(size - 4) == 1
				&& stack.get(size - 3) == 2
				&& stack.get(size - 2) == 3
				&& stack.get(size - 1) == 1) {
        			answer++;
        			for(int j = 0; j < 4; j++) {
        				stack.pop();
        			}
        		}
        	}
        }
        
        return answer;
    }

}
