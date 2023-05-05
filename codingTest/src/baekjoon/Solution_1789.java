package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1789 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());
		
		int cnt = 0;
		long sum = 0;
		
		for(int i = 1; ; i++) {
			if(sum > num) break;
			
			sum += i;
			cnt++;
		}
		
		System.out.println(cnt - 1);

	}

}
