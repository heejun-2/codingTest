package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1904 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(Tile(N));

	}

	private static int Tile(int n) {
		// TODO Auto-generated method stub
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		int val1 = 1;
		int val2 = 2;
		int sum = 0;
		
		for(int i = 2; i < n; i++) {
			sum = (val1 + val2) % 15746;
			val1 = val2;
			val2 = sum;
		}
		
		return sum;
	}

}
