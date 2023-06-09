package baekjoon;

import java.util.Scanner;

public class Solution_10813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < M; i++) {
			int basket1 = sc.nextInt();
			int basket2 = sc.nextInt();
			int change = arr[basket1-1];
			
			arr[basket1-1] = arr[basket2-1];
			arr[basket2-1] = change;
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}
