package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
	    int quarter = 25;  //쿼터 0.25$
	    int dime = 10;  //다임 0.10$
	    int nickel = 5;  //니켈 0.05$
	    int penny = 1;  //페니 0.01$
		
		for(int i = 0; i < T; i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			sb.append((tmp / quarter) + " ");
			tmp %= quarter;
			sb.append((tmp / dime) + " ");
			tmp %= dime;
			sb.append((tmp / nickel) + " ");
			tmp %= nickel;
			sb.append((tmp / penny) + " ");
			
		}
		
		System.out.println(sb.toString());

	}

}
