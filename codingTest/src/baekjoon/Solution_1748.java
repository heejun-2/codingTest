package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1748 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int plus = 1;
		int length = 10;
		
		for(int i = 1; i <= N; i++) {
			if(i == length) {
				plus++;
				length *= 10;
			}
			cnt += plus;
		}
		
		System.out.println(cnt);

	}

}
