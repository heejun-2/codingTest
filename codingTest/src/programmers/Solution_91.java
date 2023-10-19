package programmers;

import java.util.Stack;

public class Solution_91 {
	// 짝지어 제거하기
	public int solution(String s){
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if(stack.isEmpty()) {
        		stack.push(c);
        	}
        	else {
        		if(stack.peek() == c) {
        			stack.pop();
        		}else {
        			stack.push(c);
        		}
        	}
        }
        
        answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }

}
