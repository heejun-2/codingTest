package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1021 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> deque = new LinkedList<Integer>();
		
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		
		int[] seq = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			int target_idx = deque.indexOf(seq[i]);
			int half_idx;
			
			if(deque.size() % 2 == 0) {
				half_idx = deque.size() / 2 - 1;
			}
			else {
				half_idx = deque.size() / 2;
			}
			
			if(target_idx <= half_idx) {
				for(int j = 0; j < target_idx; j++) {
					int tmp = deque.pollFirst();
					deque.offerLast(tmp);
					cnt++;
				}
			}
			else {
				for(int j = 0; j < deque.size() - target_idx; j++) {
					int tmp = deque.pollLast();
					deque.offerFirst(tmp);
					cnt++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(cnt);

	}

}