package baekjoon;

import java.util.Scanner;

public class Solution_10886 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[2];
		
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if(temp == 0) {
				arr[0]++;
			}else {
				arr[1]++;
			}
		}
		
		if(arr[0] > arr[1]) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}
	}

}
