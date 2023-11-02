package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2501 {
	// 약수 구하기
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int result = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				cnt++;
				if(cnt == K) {
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
