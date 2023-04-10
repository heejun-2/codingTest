package baekjoon;

import java.util.Scanner;

public class Solution_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		if(B >= C) {
			System.out.println(-1);
		}else {
			System.out.println((A/(C-B))+1);
		}
	}

}
