package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1225 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			Queue<Integer> q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < 8; i++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			int minus = 1;
			while(true) {
				int tmp = q.poll();
				tmp -= minus;
				minus++;
				
				if(minus == 6) minus = 1;
				
				if(tmp <= 0) {
					tmp = 0;
				}
				q.add(tmp);
				
				if(tmp == 0) break;
				
			}
			
			sb.append("#"+tc+" ");
			while(!q.isEmpty()) {
				sb.append(q.poll()+" ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
