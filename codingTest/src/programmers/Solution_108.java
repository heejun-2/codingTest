package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution_108 {
	// 기능개발
	public int[] solution(int[] progresses, int[] speeds) {
		// 1. 배포 가능한 날짜 구하기
		int[] days = new int[progresses.length];
		
		for(int i = 0; i < progresses.length; i++) {
			int remain = 100 - progresses[i];
			if(remain % speeds[i] == 0) {
				days[i] = remain / speeds[i];
			}else {
				days[i] = remain / speeds[i] + 1;
			}
		}
		// 2. 앞 기능의 완성여부 확인 후 answer에 추가
		List<Integer> q = new ArrayList<>();
		int tmp = days[0];
		int cnt = 1;
		for(int i = 1; i < progresses.length; i++) {
			if(tmp >= days[i]) {
				cnt++;
			}else {
				q.add(cnt);
				cnt = 1;
				tmp = days[i];
			}
		}
		q.add(cnt);
		
        int[] answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = q.get(i);
        }
        
        return answer;
    }

}
