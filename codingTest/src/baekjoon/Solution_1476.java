package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1476 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e, s, m, year;
		e = s = m = year = 1;
		
		
		while(true) {
			if(e == E && s == S && m == M) {
				break;
			}
			
			e++;
			s++;
			m++;
			year++;
			
			if(e > 15) e = 1;
			if(s > 28) s = 1;
			if(m > 19) m = 1;
		}
		
		System.out.println(year);

	}

}
