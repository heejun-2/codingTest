package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_13241 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long result = a * b / gcd(a, b);

		System.out.println(result);
	}

	public static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		while(b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

}
