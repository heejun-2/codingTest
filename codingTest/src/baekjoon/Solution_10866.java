package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Solution_10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
				case "push_front":
					dq.addFirst(Integer.parseInt(st.nextToken()));
					break;
					
				case "push_back":
					dq.addLast(Integer.parseInt(st.nextToken()));
					break;
				
				case "pop_front":
					if(dq.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(dq.pollFirst()).append("\n");
					}
					break;
					
				case "pop_back":
					if(dq.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(dq.pollLast()).append("\n");
					}
					break;
					
				case "size":
					sb.append(dq.size()).append("\n");
					break;
					
				case "empty":
					if(dq.isEmpty()) {
						sb.append(1).append("\n");
					}else {
						sb.append(0).append("\n");
					}
					break;
					
				case "front":
					if(dq.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(dq.peekFirst()).append("\n");
					}
					break;
					
				case "back":
					if(dq.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(dq.peekLast()).append("\n");
					}
					break;		
				
				default:
					break;
			}
		}
		
		System.out.println(sb.toString());

	}

}
