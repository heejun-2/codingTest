package programmers;

public class Solution_132 {
	// 이어 붙인 수
	public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int num : num_list) {
        	if(num % 2 == 0) {
        		even += Integer.toString(num);
        	}else {
        		odd += Integer.toString(num);
        	}
        }
        
        answer = Integer.valueOf(odd) + Integer.valueOf(even);
        
        return answer;
    }

}
