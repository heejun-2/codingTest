package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1976 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int hour1 = Integer.parseInt(st.nextToken());
			int minute1 = Integer.parseInt(st.nextToken());
			int hour2 = Integer.parseInt(st.nextToken());
			int minute2 = Integer.parseInt(st.nextToken());
			
			int hour = hour1 + hour2;
			if(hour > 12) hour -= 12;
			
			int minute = minute1 + minute2;
			if(minute > 60) {
				minute -= 60;
				hour++;
			}
			
			sb.append("#"+tc+" "+hour+" "+minute).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
