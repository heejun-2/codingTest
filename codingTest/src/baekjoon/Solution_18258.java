package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_18258 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int tmp = 0;
		
		StringTokenizer st;
		
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch (s) {
			case "push": {
				int x = Integer.parseInt(st.nextToken());
				q.add(x);
				tmp = x;
				break;
			}
			case "pop": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
				break;
			}
			case "size": {
				sb.append(q.size()).append("\n");
				break;
			}
			case "empty": {
				if (q.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			}
			case "front": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.peek()).append("\n");
				}
				break;
			}
			case "back": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(tmp).append("\n");
				}
				break;
			}
			default:
				break;
			}
		}
		
		System.out.println(sb.toString());

	}

}
