package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1526 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for(int i = N; i >= 4; i--) {
			boolean pass = true;
			int tmp = i;
			
			while(tmp != 0) {
				if(tmp % 10 == 4 || tmp % 10 == 7) {
					tmp /= 10;
				}
				else {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
