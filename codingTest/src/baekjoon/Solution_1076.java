package baekjoon;

import java.util.Scanner;

public class Solution_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		
		String first = sc.next();
		String second = sc.next();
		String third = sc.next();
		
		int num1 = 0;
		int num2 = 0;
		long num3 = 0;
		
		for(int i = 0; i < color.length; i++) {
			if(first.equals(color[i])) {
				num1 = i * 10;
			}
			if(second.equals(color[i])) {
				num2 = i;
			}
			if(third.equals(color[i])) {
				num3 = (long)Math.pow(10, i);
			}
		}
		
		System.out.println( (num1+num2) * num3);
		
	}

}
