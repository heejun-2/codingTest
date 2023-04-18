package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			if(check() == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean check() throws IOException {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[26];
		int prev = 0;
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			
			if(prev != now) {
				if(check[now - 97] == false) {
					check[now - 97] = true;
					prev = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		
		return true;
	}

}
