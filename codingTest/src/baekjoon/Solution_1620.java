package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_1620 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			String pocketmon = br.readLine();
			String num = String.valueOf(i);
			map.put(pocketmon, num);
			map.put(num, pocketmon);
		}
		
		for(int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
