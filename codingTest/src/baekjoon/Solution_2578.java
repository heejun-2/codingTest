package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2578 {

	static int[][] map = new int[5][5];
	static int cnt;
	static int turn = 1;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 5; j++) {
				int N = Integer.parseInt(st.nextToken());
				
				for(int k = 0; k < 5; k++) {
					for(int l = 0; l < 5; l++) {
						if(map[k][l] == N) {
							map[k][l] = 0;
						}
					}
				}
				
				col();
				row();
				diag1();
				diag2();
				
				if(cnt >= 3) {
					System.out.println(turn);
					System.exit(0);
				}
				
				cnt = 0;
				turn++;
			}
		}

	}
	
	public static void col() {
		for(int i = 0; i < 5; i++) {
			int count = 0;
			
			for(int j = 0; j < 5; j++) {
				if(map[j][i] == 0) count++;
			}
			if(count == 5) cnt++;
		}
	}
	
	public static void row() {
		for(int i = 0; i < 5; i++) {
			int count = 0;
			
			for(int j = 0; j < 5; j++) {
				if(map[i][j] == 0) count++;
			}
			if(count == 5) cnt++;
		}
	}
	
	public static void diag1() {
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			if(map[i][4 - i] == 0) count++;
		}
		if(count == 5) cnt++;
	}
	
	public static void diag2() {
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			if(map[i][i] == 0) count++;
		}
		if(count == 5) cnt++;
	}
	

}
