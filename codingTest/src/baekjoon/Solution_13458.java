package baekjoon;

import java.util.Scanner;

public class Solution_13458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long count = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] -= B;
			count++;
			
			if(arr[i] > 0) {
				if(arr[i] % C == 0) {
					count += (arr[i] / C);
				}else {
					count += (arr[i] / C + 1);
				}
				
			}
			
		}
		
		System.out.println(count);
	}

}
