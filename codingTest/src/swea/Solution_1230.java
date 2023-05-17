package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1230 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			LinkedList<Integer> l = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				l.add(Integer.parseInt(st.nextToken()));
			}
			
			int K = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < K; i++) {
				String s = st.nextToken();
				
				if(s.equals("I")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					
					int[] arr = new int[y];
					
					for(int j = 0; j < y; j++) {
						arr[j] = Integer.parseInt(st.nextToken());
					}
					
					for(int j = y - 1; j >= 0; j--) {
						l.add(x, arr[j]);
					}
				}
				
				if(s.equals("D")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					
					for(int j = 0; j < y; j++) {
						l.remove(x);
					}
				}
				
				if(s.equals("A")) {
					int y = Integer.parseInt(st.nextToken());
					
					for(int j = 0; j < y; j++) {
						l.add(Integer.parseInt(st.nextToken()));
					}
				}
				
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < 10; i++) {
				sb.append(l.poll()+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
