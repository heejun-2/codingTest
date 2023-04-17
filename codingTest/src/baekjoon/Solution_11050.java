package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11050 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
		
	}

	private static int factorial(int N) {
		// TODO Auto-generated method stub
		if(N <= 1) {
			return 1;
		}
		return N * factorial(N - 1);
	}

}
