package programmers;

public class Solution_127 {
	// 로또의 최고순위와 최저순위
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero = 0;
        int cnt = 0;
        
        for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zero++;
        		continue;
        	}
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			cnt++;
        			break;
        		}
        	}
        }
        
        int min = cnt;
        int max = cnt + zero;
        
        answer[0] = Math.min(7 - max, 6);
        answer[1] = Math.min(7 - min, 6);
        
        return answer;
    }

}
