package programmers;

import java.time.LocalDate;

public class Solution_159 {
	// 날짜 비교하기
	public int solution(int[] date1, int[] date2) {
		LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
		LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
        
		if(dateA.isBefore(dateB)) {
			return 1;
		}
		else {
			return 0;
		}
    }

}
