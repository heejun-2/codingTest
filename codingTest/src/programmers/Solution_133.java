package programmers;

import java.util.Stack;

public class Solution_133 {
	// 크레인 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
        	int location = moves[i] - 1;
        	for(int j = 0; j < board.length; j++) {
        		int target = board[j][location];
        		if(target != 0) {
        			if(!stack.isEmpty() && target == stack.peek()) {
        				stack.pop();
        				answer += 2;
        			}
        			else {
        				stack.push(target);
        			}
        			board[j][location] = 0;
    				break;
        		}
        	}
        }
        
        return answer;
    }

}
