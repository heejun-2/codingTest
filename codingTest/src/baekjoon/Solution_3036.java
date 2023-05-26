package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3036 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int firstRing = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < N; i++) {
			int otherRing = Integer.parseInt(st.nextToken());
			
			int gcd = gcd(firstRing, otherRing);
			
			sb.append(firstRing / gcd).append("/").append(otherRing / gcd).append("\n");
		}
		
		System.out.println(sb.toString());

	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		int r;
		
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}

}
