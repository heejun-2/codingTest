package baekjoon;

import java.util.Scanner;

public class Solution_2581 {

	public static boolean prime[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N+1];
		get_prime();
		
		int min = 10001;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}
	
	private static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}


}
