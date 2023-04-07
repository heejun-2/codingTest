package baekjoon;

import java.util.Scanner;

public class Solution_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			boolean isPass = true;
			

			if(num == 1) {
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPass = false;
					break;
				}
			}
			
			if(isPass) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
