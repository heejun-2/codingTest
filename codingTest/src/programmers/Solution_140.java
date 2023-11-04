package programmers;

public class Solution_140 {
	// 길이에 따른 연산
	public int solution(int[] num_list) {
        int answer = 0;
        int start = 1;
        
        for(int num : num_list) {
        	if(num_list.length >= 11) {
        		answer += num;
        	}
        	else {
        		start *= num;
        		answer = start;
        	}
        }
        
        return answer;
    }
}
