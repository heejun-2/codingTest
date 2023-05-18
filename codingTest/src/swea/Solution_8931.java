package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_8931 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int K = Integer.parseInt(br.readLine());
			
			Stack<Integer> s = new Stack<>();
			
			for(int i = 0; i < K; i++) {
				int tmp = Integer.parseInt(br.readLine());
				
				if(tmp == 0) {
					s.pop();
				}else {
					s.push(tmp);
				}
			}
			
			int sum = 0;
			
			while(!s.isEmpty()) {
				sum += s.pop();
			}
			
			sb.append("#"+tc+" "+sum).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
