package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_2605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> List = new ArrayList<>();
		
		List.add(-1);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int num = sc.nextInt();
			List.add(i-num, i);
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.print(List.get(i)+" ");
		}
	}

}
