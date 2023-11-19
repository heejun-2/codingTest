package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_173 {
	// 양꼬치
	public int solution(int n, int k) {
		int answer = 12000 * n + 2000 * k;
        answer -= n / 10 * 2000;
        
        return answer;
    }
	

}
