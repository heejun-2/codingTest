package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_2161 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
	
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			sb.append(q.poll()).append(" ");
			
			if(q.isEmpty()) {
				break;
			}
			
			q.offer(q.poll());
		}
		
		System.out.println(sb.toString());

	}

}
