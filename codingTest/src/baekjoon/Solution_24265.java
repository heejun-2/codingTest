package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_24265 {
	// 알고리즘 수업 - 알고리즘의 수행 시간 4
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		// 1 ~ n 까지의 덧셈 : (n+1)*n/2
		// 여기서는 1 ~ n-1 까지이기에 n -> n-1 대입
		System.out.println(n*(n-1)/2);
		System.out.println(2);
	}

}
