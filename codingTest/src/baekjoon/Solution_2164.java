package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		while(q.size() > 1) {
			q.remove();
			int tmp = q.poll();
			q.offer(tmp);
		}
		
		System.out.println(q.peek());

	}

}
