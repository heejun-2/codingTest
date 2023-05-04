package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> s = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
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
		
		System.out.println(sum);

	}

}
