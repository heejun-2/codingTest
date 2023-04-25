package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_24416 {
	static int cnt = 0;
	static int dpCnt = 0;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		fib(N);
		fibonacci(N);
		System.out.print(cnt+" "+dpCnt);
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < n; i++) {
			dpCnt++;
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr[n-1];
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2) {
			cnt++;
			return 1;
		}
		else return (fib(n - 1) + fib(n - 2));
	}

}
