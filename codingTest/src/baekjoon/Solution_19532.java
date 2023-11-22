package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_19532 {
	// 수학은 비대면강의입니다
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		int answerX = 0 ;
		int answerY = 0;
		
		for(int i = -999; i < 1000; i++) {
			for(int j = -999; j < 1000; j++) {
				if((a*i + b*j == c) && (d*i + e*j == f)) {
					answerX = i;
					answerY = j;
					break;
				}
			}
		}
		
		System.out.println(answerX + " " + answerY);
	}

}
