package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1234 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			
			String s = st.nextToken();
			
			LinkedList<Integer> l = new LinkedList<>();
			
			for(int i = 0; i < s.length(); i++) {
				l.add(s.charAt(i) - '0');
			}
			
			int idx = 1;
			while(true) {
				if(l.get(idx) == l.get(idx-1)) {
					l.remove(idx);
					l.remove(idx-1);
					idx = 1;
				}
				else {
					idx++;
				}
				
				if(idx == l.size()) {
					break;
				}
			}
			
			sb.append("#"+tc+" ");
			while(!l.isEmpty()) {
				sb.append(l.poll());
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
