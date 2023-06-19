package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_17219 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String site = st.nextToken();
			String pwd = st.nextToken();
			
			map.put(site, pwd);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			
			sb.append(map.get(str)).append("\n");
		}
		
		System.out.println(sb.toString());
		

	}

}
