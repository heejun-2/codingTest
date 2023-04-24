package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9506 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) break;
			
			int[] arr = new int[n];
			
			int sum = 0;
			int index = 0;
			
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					arr[index++] = i;
				}
			}
			
			if(n == sum) {
				System.out.print(n+" = ");
				for(int i = 0; i < index; i++) {
					System.out.print(arr[i]);
					if(i != index-1) {
						System.out.print(" + ");
					}
				}
				System.out.println();
			}else {
				System.out.println(n+" is NOT perfect.");
			}
		}


	}

}
