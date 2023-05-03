package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1929 {
	
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1];
		
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = M; i <= N; i++) {
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}

	private static void get_prime() {
		// TODO Auto-generated method stub
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
