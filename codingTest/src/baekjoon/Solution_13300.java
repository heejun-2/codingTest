package baekjoon;

import java.util.Scanner;

public class Solution_13300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int[][] arr = new int[6][2];
		
		for(int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int Y = sc.nextInt();
			
			arr[Y-1][S]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % K == 0) {
					count += arr[i][j] / K;
				}else {
					count += arr[i][j] / K + 1;
				}
			}
		}
		
		System.out.println(count);
	}

}
