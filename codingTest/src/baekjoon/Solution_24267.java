package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_24267 {
	// 알고리즘 수업 - 알고리즘의 수행 시간 6
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n * (n-1) * (n-2) / 6);
		System.out.println(3);

	}

}
