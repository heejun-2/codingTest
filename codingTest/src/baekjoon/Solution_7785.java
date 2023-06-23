package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_7785 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, String> map = new HashMap<>();
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(map.containsKey(name)) {
				map.remove(name);
			}
			else {
				map.put(name, state);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		
		Collections.sort(list, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : list) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
