package baekjoon;

import java.util.Scanner;

public class Solution_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day = 0;
		
		for(int i = 1; i < x; i++) {
			day += month[i];
		}
		day += y;
		
		System.out.println(days[day%7]);
		
	}

}
