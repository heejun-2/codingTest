package baekjoon;

import java.util.Scanner;

public class Solution_1977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = N;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i) {
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

}
