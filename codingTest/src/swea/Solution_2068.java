package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2068 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= T; i++) {
			int max = 0;
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				if(max < tmp) {
					max = tmp;
				}
			}
			
			System.out.println("#"+i+" "+max);
		}

	}

}
